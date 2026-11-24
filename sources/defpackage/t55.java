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
public final class t55 implements View.OnClickListener {
    public final byte a;
    public final g95 b;

    public t55(g95 g95Var, byte b) {
        this.a = b;
        this.b = g95Var;
    }

    @Override
    public final void onClick(View view) {
        String M0;
        byte b = this.a;
        int i = 2;
        g95 g95Var = this.b;
        switch (b) {
            case 0:
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (sharedInstance.getVideoState(true) == 2) {
                        sharedInstance.stopScreenCapture();
                        return;
                    }
                    LaunchActivity launchActivity = g95Var.b2;
                    if (launchActivity != null) {
                        g95Var.b2.startActivityForResult(((MediaProjectionManager) launchActivity.getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                g95Var.b3.p();
                g95Var.b2.t0(new ana());
                g95Var.dismiss();
                return;
            case 2:
                qd2 qd2Var = g95Var.T2;
                if (qd2Var != null && qd2Var.w) {
                    g95Var.B1(g95Var.H1.getTitleTextView());
                    return;
                }
                return;
            case 3:
                m75 m75Var = g95Var.A1;
                if (m75Var.m()) {
                    m75Var.j();
                    return;
                } else {
                    m75Var.d();
                    return;
                }
            case 4:
                Editable text = g95Var.A1.getText();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = text.toString();
                tL_textWithEntities.entities = hs6.d0(g95Var.a).Y(new CharSequence[]{text}, true, true);
                g95Var.t1(tL_textWithEntities);
                return;
            case 5:
                int F0 = g95Var.F0();
                if (F0 > 0 && F0 != Integer.MAX_VALUE) {
                    g95Var.J1.x0(0, F0, null);
                }
                wu3 wu3Var = g95Var.A1.a;
                wu3Var.requestFocus();
                gm.E3(wu3Var);
                return;
            case 6:
                qd2 qd2Var2 = g95Var.T2;
                if (qd2Var2 != null && !qd2Var2.k()) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().toggleSpeakerphoneOrShowRouteSheet(g95Var.getContext(), false);
                        return;
                    }
                    return;
                }
                g95Var.a1(false);
                return;
            case 7:
                ArrayList arrayList = g95Var.R3;
                p09 p09Var = g95Var.w4;
                c75 c75Var = g95Var.T3;
                o04 o04Var = c75Var.i0;
                if (c75Var.h0) {
                    gm.r(o04Var);
                }
                gm.d3(o04Var, 3000L);
                c75Var.h0 = true;
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                    sharedInstance2.switchCamera();
                    if (g95Var.x4 == 18) {
                        g95Var.x4 = (byte) 39;
                        p09Var.K(39);
                        p09Var.start();
                    } else {
                        p09Var.I(0, false, false);
                        g95Var.x4 = (byte) 18;
                        p09Var.K(18);
                        p09Var.start();
                    }
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ha5 ha5Var = (ha5) arrayList.get(i2);
                        rd2 rd2Var = ha5Var.x;
                        if (rd2Var.a.self && !rd2Var.b) {
                            da5 da5Var = ha5Var.a;
                            if (ha5Var.H0 == null) {
                                ha5Var.I0 = false;
                                ImageView imageView = ha5Var.x0;
                                if (imageView == null) {
                                    ha5Var.x0 = new ImageView(ha5Var.getContext());
                                } else {
                                    imageView.animate().cancel();
                                }
                                if (da5Var.d.isFirstFrameRendered()) {
                                    Bitmap bitmap = da5Var.e.getBitmap(100, 100);
                                    if (bitmap != null) {
                                        Utilities.blurBitmap(bitmap, 3);
                                        ha5Var.x0.setBackground(new BitmapDrawable(bitmap));
                                    }
                                    ha5Var.x0.setAlpha(0.0f);
                                } else {
                                    ha5Var.x0.setAlpha(1.0f);
                                }
                                if (ha5Var.x0.getParent() == null) {
                                    da5Var.addView(ha5Var.x0);
                                }
                                ((FrameLayout.LayoutParams) ha5Var.x0.getLayoutParams()).gravity = 17;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ha5Var.H0 = ofFloat;
                                ofFloat.addUpdateListener(new ba5(ha5Var, (byte) 1));
                                ha5Var.H0.addListener(new fa5(ha5Var, (byte) 2));
                                ha5Var.H0.setDuration(400L);
                                ha5Var.H0.setInterpolator(d53.f);
                                ha5Var.H0.start();
                            }
                        }
                    }
                    return;
                }
                return;
            case 8:
                qd2 qd2Var3 = g95Var.T2;
                if (qd2Var3 != null && qd2Var3.w) {
                    g95Var.B1(g95Var.H1.getTitleTextView());
                    return;
                }
                return;
            case 9:
                qd2 qd2Var4 = g95Var.T2;
                if (qd2Var4 != null && qd2Var4.w) {
                    g95Var.B1(g95Var.H1.getTitleTextView());
                    return;
                }
                return;
            case 10:
                if (g95Var.Y0() != 1) {
                    i = 1;
                } else {
                    VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                    if (sharedInstance3 == null || !sharedInstance3.isBluetoothHeadsetConnected()) {
                        i = 0;
                    }
                }
                g95Var.n5 = Integer.valueOf(i);
                g95Var.L1(true, true);
                g95Var.n5 = null;
                gm.c3(new ex1(g95Var, i, (byte) 1));
                return;
            case 11:
                r7 r7Var = g95Var.b3;
                a8 a8Var = g95Var.p3;
                a8 a8Var2 = g95Var.q3;
                a8 a8Var3 = g95Var.g3;
                qd2 qd2Var5 = g95Var.T2;
                if (qd2Var5 != null && !g95Var.T3.b) {
                    if (qd2Var5.b.join_muted) {
                        int i3 = cmb.Xg;
                        a8Var.d(cmb.w0(null, i3, false), cmb.w0(null, i3, false));
                        a8Var.setChecked(false);
                        int i4 = cmb.mh;
                        a8Var2.d(cmb.w0(null, i4, false), cmb.w0(null, i4, false));
                        a8Var2.setChecked(true);
                    } else {
                        int i5 = cmb.mh;
                        a8Var.d(cmb.w0(null, i5, false), cmb.w0(null, i5, false));
                        a8Var.setChecked(true);
                        int i6 = cmb.Xg;
                        a8Var2.d(cmb.w0(null, i6, false), cmb.w0(null, i6, false));
                        a8Var2.setChecked(false);
                    }
                    g95Var.e2 = false;
                    r7Var.u(1);
                    r7Var.u(2);
                    if (VoIPService.getSharedInstance() != null && (VoIPService.getSharedInstance().hasEarpiece() || VoIPService.getSharedInstance().isBluetoothHeadsetConnected())) {
                        int currentAudioRoute = VoIPService.getSharedInstance().getCurrentAudioRoute();
                        if (currentAudioRoute == 2) {
                            a8Var3.setIcon(2131232431);
                            if (VoIPService.getSharedInstance().currentBluetoothDeviceName != null) {
                                M0 = VoIPService.getSharedInstance().currentBluetoothDeviceName;
                            } else {
                                M0 = jb6.M0(2131743187, null);
                            }
                            a8Var3.setSubtext(M0);
                        } else {
                            int i7 = 2131743184;
                            int i8 = 2131232434;
                            if (currentAudioRoute == 0) {
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i8 = 2131232432;
                                }
                                a8Var3.setIcon(i8);
                                if (VoIPService.getSharedInstance().isHeadsetPlugged()) {
                                    i7 = 2131743185;
                                }
                                a8Var3.setSubtext(jb6.M0(i7, null));
                            } else if (currentAudioRoute == 1) {
                                if (VoipAudioManager.get().isSpeakerphoneOn()) {
                                    a8Var3.setIcon(2131232436);
                                    a8Var3.setSubtext(jb6.M0(2131743183, null));
                                } else {
                                    a8Var3.setIcon(2131232434);
                                    a8Var3.setSubtext(jb6.M0(2131743184, null));
                                }
                            }
                        }
                    }
                    g95Var.E1();
                    r7Var.U(null, null);
                    return;
                }
                return;
            default:
                oa5.g0 = false;
                g95Var.dismiss();
                return;
        }
    }
}
