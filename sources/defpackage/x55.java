package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.projection.MediaProjectionManager;
import android.text.Editable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class x55 implements View.OnClickListener {
    public final byte a;
    public final j95 b;

    public x55(j95 j95Var, byte b) {
        this.a = b;
        this.b = j95Var;
    }

    @Override
    public final void onClick(View view) {
        String M0;
        byte b = this.a;
        int i = 2;
        j95 j95Var = this.b;
        switch (b) {
            case 0:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = j95Var.b2;
                    if (launchActivity != null) {
                        j95Var.b2.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                j95Var.b3.p();
                j95Var.b2.t0(new woa());
                j95Var.dismiss();
                return;
            case 2:
                vc2 vc2Var = j95Var.T2;
                if (vc2Var != null && vc2Var.w) {
                    j95Var.C1(j95Var.H1.getTitleTextView());
                    return;
                }
                return;
            case 3:
                q75 q75Var = j95Var.A1;
                if (q75Var.m()) {
                    q75Var.j();
                    return;
                } else {
                    q75Var.d();
                    return;
                }
            case 4:
                Editable text = j95Var.A1.getText();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = text.toString();
                tL_textWithEntities.entities = ls6.d0(j95Var.a).Y(new CharSequence[]{text}, true, true);
                j95Var.u1(tL_textWithEntities);
                return;
            case 5:
                int G0 = j95Var.G0();
                if (G0 > 0 && G0 != Integer.MAX_VALUE) {
                    j95Var.J1.y0(0, G0, null);
                }
                du3 du3Var = j95Var.A1.a;
                du3Var.requestFocus();
                hl.E3(du3Var);
                return;
            case 6:
                vc2 vc2Var2 = j95Var.T2;
                if (vc2Var2 != null && !vc2Var2.k()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(j95Var.getContext(), false);
                        return;
                    }
                    return;
                }
                j95Var.b1(false);
                return;
            case 7:
                vc2 vc2Var3 = j95Var.T2;
                if (vc2Var3 != null && vc2Var3.w) {
                    j95Var.C1(j95Var.H1.getTitleTextView());
                    return;
                }
                return;
            case 8:
                vc2 vc2Var4 = j95Var.T2;
                if (vc2Var4 != null && vc2Var4.w) {
                    j95Var.C1(j95Var.H1.getTitleTextView());
                    return;
                }
                return;
            case 9:
                ArrayList arrayList = j95Var.R3;
                b29 b29Var = j95Var.w4;
                g75 g75Var = j95Var.T3;
                zz3 zz3Var = g75Var.i0;
                if (g75Var.h0) {
                    hl.r(zz3Var);
                }
                hl.d3(zz3Var, 3000L);
                g75Var.h0 = true;
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (j95Var.x4 == 18) {
                        j95Var.x4 = (byte) 39;
                        b29Var.K(39);
                        b29Var.start();
                    } else {
                        b29Var.I(0, false, false);
                        j95Var.x4 = (byte) 18;
                        b29Var.K(18);
                        b29Var.start();
                    }
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ka5 ka5Var = (ka5) arrayList.get(i2);
                        wc2 wc2Var = ka5Var.x;
                        if (wc2Var.a.self && !wc2Var.b) {
                            ga5 ga5Var = ka5Var.a;
                            if (ka5Var.H0 == null) {
                                ka5Var.I0 = false;
                                ImageView imageView = ka5Var.x0;
                                if (imageView == null) {
                                    ka5Var.x0 = new ImageView(ka5Var.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (ga5Var.d.c.P) {
                                    Bitmap bitmap = ga5Var.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        ka5Var.x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    ka5Var.x0.setAlpha(0.0f);
                                } else {
                                    ka5Var.x0.setAlpha(1.0f);
                                }
                                if (ka5Var.x0.getParent() == null) {
                                    ga5Var.addView(ka5Var.x0);
                                }
                                ((FrameLayout.LayoutParams) ka5Var.x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ka5Var.H0 = ofFloat;
                                ofFloat.addUpdateListener(new fa5(ka5Var, (byte) 1));
                                ka5Var.H0.addListener(new ia5(ka5Var, (byte) 2));
                                ka5Var.H0.setDuration(400L);
                                ka5Var.H0.setInterpolator(k43.f);
                                ka5Var.H0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            case 10:
                if (j95Var.Z0() != 1) {
                    i = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 == null || !sharedInstance3.isBluetoothHeadsetConnected()) {
                        i = 0;
                    }
                }
                j95Var.n5 = Integer.valueOf(i);
                j95Var.M1(true, true);
                j95Var.n5 = null;
                hl.c3(new gw1(j95Var, i, (byte) 1));
                return;
            case 11:
                s7 s7Var = j95Var.b3;
                b8 b8Var = j95Var.p3;
                b8 b8Var2 = j95Var.q3;
                b8 b8Var3 = j95Var.g3;
                vc2 vc2Var5 = j95Var.T2;
                if (vc2Var5 != null && !j95Var.T3.b) {
                    if (vc2Var5.b.join_muted) {
                        int i3 = aob.Yg;
                        b8Var.d(aob.w0(null, i3, false), aob.w0(null, i3, false));
                        b8Var.setChecked(false);
                        int i4 = aob.nh;
                        b8Var2.d(aob.w0(null, i4, false), aob.w0(null, i4, false));
                        b8Var2.setChecked(true);
                    } else {
                        int i5 = aob.nh;
                        b8Var.d(aob.w0(null, i5, false), aob.w0(null, i5, false));
                        b8Var.setChecked(true);
                        int i6 = aob.Yg;
                        b8Var2.d(aob.w0(null, i6, false), aob.w0(null, i6, false));
                        b8Var2.setChecked(false);
                    }
                    j95Var.e2 = false;
                    s7Var.u(1);
                    s7Var.u(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            b8Var3.setIcon(2131232430);
                            if (VoIPService.getSharedInstance().currentBluetoothDeviceName != null) {
                                M0 = VoIPService.getSharedInstance().currentBluetoothDeviceName;
                            } else {
                                M0 = ob6.M0(2131743155, null);
                            }
                            b8Var3.setSubtext(M0);
                        } else {
                            int i7 = 2131743152;
                            int i8 = 2131232433;
                            if (currentAudioRoute == 0) {
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i8 = 2131232431;
                                }
                                b8Var3.setIcon(i8);
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i7 = 2131743153;
                                }
                                b8Var3.setSubtext(ob6.M0(i7, null));
                            } else if (currentAudioRoute == 1) {
                                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                    b8Var3.setIcon(2131232435);
                                    b8Var3.setSubtext(ob6.M0(2131743151, null));
                                } else {
                                    b8Var3.setIcon(2131232433);
                                    b8Var3.setSubtext(ob6.M0(2131743152, null));
                                }
                            }
                        }
                    }
                    j95Var.F1();
                    s7Var.U(null, null);
                    return;
                }
                return;
            default:
                ra5.g0 = false;
                j95Var.dismiss();
                return;
        }
    }
}
