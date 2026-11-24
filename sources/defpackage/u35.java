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
public final class u35 implements View.OnClickListener {
    public final byte a;
    public final h75 b;

    public u35(h75 h75Var, byte b) {
        this.a = b;
        this.b = h75Var;
    }

    @Override
    public final void onClick(View view) {
        String M0;
        byte b = this.a;
        int i = 2;
        h75 h75Var = this.b;
        switch (b) {
            case 0:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = h75Var.b2;
                    if (launchActivity != null) {
                        h75Var.b2.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                h75Var.b3.p();
                h75Var.b2.t0(new zka());
                h75Var.dismiss();
                return;
            case 2:
                fc2 fc2Var = h75Var.T2;
                if (fc2Var != null && fc2Var.w) {
                    h75Var.B1(h75Var.H1.getTitleTextView());
                    return;
                }
                return;
            case 3:
                o55 o55Var = h75Var.A1;
                if (o55Var.m()) {
                    o55Var.j();
                    return;
                } else {
                    o55Var.d();
                    return;
                }
            case 4:
                Editable text = h75Var.A1.getText();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = text.toString();
                tL_textWithEntities.entities = hq6.d0(h75Var.a).Y(new CharSequence[]{text}, true, true);
                h75Var.t1(tL_textWithEntities);
                return;
            case 5:
                int F0 = h75Var.F0();
                if (F0 > 0 && F0 != Integer.MAX_VALUE) {
                    h75Var.J1.x0(0, F0, null);
                }
                mt3 mt3Var = h75Var.A1.a;
                mt3Var.requestFocus();
                gl.F3(mt3Var);
                return;
            case 6:
                fc2 fc2Var2 = h75Var.T2;
                if (fc2Var2 != null && !fc2Var2.k()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(h75Var.getContext(), false);
                        return;
                    }
                    return;
                }
                h75Var.a1(false);
                return;
            case 7:
                ArrayList arrayList = h75Var.R3;
                oy8 oy8Var = h75Var.w4;
                e55 e55Var = h75Var.T3;
                ez3 ez3Var = e55Var.i0;
                if (e55Var.h0) {
                    gl.r(ez3Var);
                }
                gl.e3(ez3Var, 3000L);
                e55Var.h0 = true;
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (h75Var.x4 == 18) {
                        h75Var.x4 = (byte) 39;
                        oy8Var.K(39);
                        oy8Var.start();
                    } else {
                        oy8Var.I(0, false, false);
                        h75Var.x4 = (byte) 18;
                        oy8Var.K(18);
                        oy8Var.start();
                    }
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        h85 h85Var = (h85) arrayList.get(i2);
                        gc2 gc2Var = h85Var.x;
                        if (gc2Var.a.self && !gc2Var.b) {
                            d85 d85Var = h85Var.a;
                            if (h85Var.H0 == null) {
                                h85Var.I0 = false;
                                ImageView imageView = h85Var.x0;
                                if (imageView == null) {
                                    h85Var.x0 = new ImageView(h85Var.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (d85Var.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = d85Var.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        h85Var.x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    h85Var.x0.setAlpha(0.0f);
                                } else {
                                    h85Var.x0.setAlpha(1.0f);
                                }
                                if (h85Var.x0.getParent() == null) {
                                    d85Var.addView(h85Var.x0);
                                }
                                ((FrameLayout.LayoutParams) h85Var.x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                h85Var.H0 = ofFloat;
                                ofFloat.addUpdateListener(new c85(h85Var, (byte) 1));
                                h85Var.H0.addListener(new f85(h85Var, (byte) 2));
                                h85Var.H0.setDuration(400L);
                                h85Var.H0.setInterpolator(s33.f);
                                h85Var.H0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            case 8:
                fc2 fc2Var3 = h75Var.T2;
                if (fc2Var3 != null && fc2Var3.w) {
                    h75Var.B1(h75Var.H1.getTitleTextView());
                    return;
                }
                return;
            case 9:
                fc2 fc2Var4 = h75Var.T2;
                if (fc2Var4 != null && fc2Var4.w) {
                    h75Var.B1(h75Var.H1.getTitleTextView());
                    return;
                }
                return;
            case 10:
                if (h75Var.Y0() != 1) {
                    i = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 == null || !sharedInstance3.isBluetoothHeadsetConnected()) {
                        i = 0;
                    }
                }
                h75Var.n5 = Integer.valueOf(i);
                h75Var.L1(true, true);
                h75Var.n5 = null;
                gl.d3(new sv1(h75Var, i, (byte) 1));
                return;
            case 11:
                r7 r7Var = h75Var.b3;
                a8 a8Var = h75Var.p3;
                a8 a8Var2 = h75Var.q3;
                a8 a8Var3 = h75Var.g3;
                fc2 fc2Var5 = h75Var.T2;
                if (fc2Var5 != null && !h75Var.T3.b) {
                    if (fc2Var5.b.join_muted) {
                        int i3 = bkb.Xg;
                        a8Var.d(bkb.w0(null, i3, false), bkb.w0(null, i3, false));
                        a8Var.setChecked(false);
                        int i4 = bkb.mh;
                        a8Var2.d(bkb.w0(null, i4, false), bkb.w0(null, i4, false));
                        a8Var2.setChecked(true);
                    } else {
                        int i5 = bkb.mh;
                        a8Var.d(bkb.w0(null, i5, false), bkb.w0(null, i5, false));
                        a8Var.setChecked(true);
                        int i6 = bkb.Xg;
                        a8Var2.d(bkb.w0(null, i6, false), bkb.w0(null, i6, false));
                        a8Var2.setChecked(false);
                    }
                    h75Var.e2 = false;
                    r7Var.u(1);
                    r7Var.u(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            a8Var3.setIcon(2131232430);
                            if (VoIPService.getSharedInstance().currentBluetoothDeviceName != null) {
                                M0 = VoIPService.getSharedInstance().currentBluetoothDeviceName;
                            } else {
                                M0 = k96.M0(2131743261, null);
                            }
                            a8Var3.setSubtext(M0);
                        } else {
                            int i7 = 2131743258;
                            int i8 = 2131232433;
                            if (currentAudioRoute == 0) {
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i8 = 2131232431;
                                }
                                a8Var3.setIcon(i8);
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i7 = 2131743259;
                                }
                                a8Var3.setSubtext(k96.M0(i7, null));
                            } else if (currentAudioRoute == 1) {
                                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                    a8Var3.setIcon(2131232435);
                                    a8Var3.setSubtext(k96.M0(2131743257, null));
                                } else {
                                    a8Var3.setIcon(2131232433);
                                    a8Var3.setSubtext(k96.M0(2131743258, null));
                                }
                            }
                        }
                    }
                    h75Var.E1();
                    r7Var.U(null, null);
                    return;
                }
                return;
            default:
                o85.g0 = false;
                h75Var.dismiss();
                return;
        }
    }
}
