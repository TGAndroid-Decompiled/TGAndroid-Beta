package ai;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.kf;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bo;
import org.telegram.ui.cr0;
import org.telegram.ui.dc1;
import org.telegram.ui.fv0;
import org.telegram.ui.hr0;
import org.telegram.ui.ir0;
import org.telegram.ui.jt0;
import org.telegram.ui.ku0;
import org.telegram.ui.wu0;
import org.telegram.ui.xg0;
import org.telegram.ui.yg0;
import org.telegram.ui.zb0;
public final class j3 implements View.OnClickListener {
    public final int f1039a;
    public final boolean f1040b;
    public final Object f1041c;

    public j3(int i10, Object obj, boolean z10) {
        this.f1039a = i10;
        this.f1041c = obj;
        this.f1040b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        kf kfVar;
        boolean z11;
        View view2;
        switch (this.f1039a) {
            case 0:
                f6 f6Var = (f6) this.f1041c;
                boolean z12 = this.f1040b;
                MessagesController.getInstance(f6Var.C2).setStoryQuality(!z12);
                vc vcVar = new vc(f6Var.f803c1, f6Var.B0);
                int i12 = R.raw.chats_infotip;
                if (!z12) {
                    i10 = R.string.StoryQualityIncreasedTitle;
                } else {
                    i10 = R.string.StoryQualityDecreasedTitle;
                }
                String string = LocaleController.getString(i10);
                if (!z12) {
                    i11 = R.string.StoryQualityIncreasedMessage;
                } else {
                    i11 = R.string.StoryQualityDecreasedMessage;
                }
                vcVar.M(string, LocaleController.getString(i11), i12).j();
                w5 w5Var = f6Var.f854t1;
                if (w5Var != null) {
                    w5Var.a();
                    return;
                }
                return;
            case 1:
                w5 w5Var2 = (w5) this.f1041c;
                boolean z13 = this.f1040b;
                d2 d2Var = d2.W;
                if (d2Var != null) {
                    boolean z14 = !z13;
                    if (d2Var.f692n && d2Var.f693r != z14) {
                        d2Var.f693r = z14;
                        NativeInstance nativeInstance = d2Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                w5 w5Var3 = w5Var2.f1658l.f854t1;
                if (w5Var3 != null) {
                    w5Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f1041c;
                boolean z15 = this.f1040b;
                org.telegram.ui.ActionBar.o1 o1Var = w0Var.d;
                if (o1Var != null && o1Var.isShowing() && z15) {
                    if (!w0Var.T) {
                        w0Var.T = true;
                        w0Var.d.d(w0Var.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.a0 a0Var = w0Var.f19607c;
                if (a0Var != null) {
                    a0Var.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.s0 s0Var = w0Var.P;
                if (s0Var != null) {
                    s0Var.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                dc1 dc1Var = (dc1) this.f1041c;
                boolean z16 = this.f1040b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) dc1Var.f33094b)[i13];
                    org.telegram.ui.Cells.x0 x0Var = y0Var.f21656a;
                    if (y0Var == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x0Var.a(z10, true);
                }
                SharedConfig.setUseThreeLinesLayout(z16);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1041c;
                boolean z17 = this.f1040b;
                qd qdVar = chatActivityEnterView.E4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z17 && (kfVar = chatActivityEnterView.L0) != null) {
                    kfVar.h(!S0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.D4 = !S0;
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                AndroidUtilities.runOnUIThread(qdVar, 500L);
                return;
            case 5:
                vi viVar = (vi) this.f1041c;
                boolean z18 = this.f1040b;
                org.telegram.ui.ActionBar.o2 o2Var = viVar.f28742f0;
                if (viVar.Q0 != 0) {
                    viVar.Z1.u0();
                    viVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                ir0 ir0Var = new ir0(hashMap, arrayList, 0, true, (bo) o2Var);
                uh uhVar = new uh(viVar, hashMap, arrayList);
                cr0 cr0Var = ir0Var.f34657a;
                cr0Var.f32895s0 = uhVar;
                cr0 cr0Var2 = ir0Var.f34658b;
                cr0Var2.f32895s0 = uhVar;
                cr0Var.f32896t0 = new hr0(ir0Var, 0);
                cr0Var2.f32896t0 = new hr0(ir0Var, 1);
                int i14 = viVar.S1;
                boolean z19 = viVar.T1;
                cr0Var.f0(i14, z19);
                ir0Var.f34658b.f0(i14, z19);
                if (z18) {
                    o2Var.showAsSheet(ir0Var);
                } else {
                    o2Var.presentFragment(ir0Var);
                }
                viVar.dismiss();
                return;
            case 6:
                fg0 fg0Var = (fg0) this.f1041c;
                boolean z20 = this.f1040b;
                fg0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z20 && (!z11 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new nu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                vu vuVar = fg0Var.U;
                if (vuVar != null) {
                    vuVar.I();
                    return;
                }
                PhotoViewer photoViewer = fg0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.Z8 != null) {
                        PhotoViewer.Z8.G0(false, true);
                    }
                    ku0 ku0Var = photoViewer.f30959f0;
                    if (ku0Var != null && ku0Var.f27281f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                ku0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        ku0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) ku0Var.f27281f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(ku0Var.f27281f);
                        }
                        ku0Var.addView(ku0Var.f27281f, 0, w7.x5.e(-1, -1, 51));
                        fg0.j(false);
                    }
                    PhotoViewer.Z8 = PhotoViewer.f30911a9;
                    PhotoViewer.f30911a9 = null;
                    if (photoViewer.f30959f0 == null) {
                        photoViewer.L3 = true;
                        Bitmap bitmap = photoViewer.C3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.C3 = null;
                        }
                        photoViewer.F3 = true;
                    }
                    photoViewer.J3 = false;
                    if (photoViewer.D2) {
                        view2 = photoViewer.C2;
                    } else {
                        view2 = photoViewer.B2;
                    }
                    View view3 = view2;
                    if (photoViewer.f30959f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f31131y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f31128y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f30959f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            ik0 o9 = fg0.o(photoViewer.f31131y2.getAspectRatio(), false);
                            float f7 = o9.f24952c / photoViewer.f31122x3.getLayoutParams().width;
                            photoViewer.f31122x3.setScaleX(f7);
                            photoViewer.f31122x3.setScaleY(f7);
                            photoViewer.f31122x3.setTranslationX(o9.f24950a);
                            photoViewer.f31122x3.setTranslationY(o9.f24951b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o9.f24950a - photoViewer.f31131y2.getX());
                            view3.setTranslationY(o9.f24951b - photoViewer.f31131y2.getY());
                            wu0 wu0Var = photoViewer.E2;
                            if (wu0Var != null) {
                                wu0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            jt0 jt0Var = new jt0(photoViewer, f7, 1);
                            view3.setOutlineProvider(jt0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f31122x3.setOutlineProvider(jt0Var);
                            photoViewer.f31122x3.setClipToOutline(true);
                            wu0 wu0Var2 = photoViewer.E2;
                            if (wu0Var2 != null) {
                                wu0Var2.setOutlineProvider(jt0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            fg0.j(true);
                        }
                    } else {
                        photoViewer.f31023m6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f30958f = true;
                        ((WindowManager) photoViewer.f31128y.getSystemService("window")).addView(photoViewer.f30967g0, photoViewer.f30941d0);
                        Activity activity = photoViewer.f31128y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f30829a1.add(photoViewer.f31073s1);
                        }
                        fv0 fv0Var = photoViewer.f30946d5;
                        if (fv0Var != null && !fv0Var.f33778s) {
                            fv0Var.f33763a.setVisible(false, false);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (photoViewer.D2) {
                        i2.e0 e0Var = photoViewer.F2.d;
                        if (e0Var != null) {
                            e0Var.v1(null);
                        }
                        photoViewer.F2.U(photoViewer.C2);
                        photoViewer.C2.setVisibility(4);
                        photoViewer.G3 = 2;
                        photoViewer.F3 = false;
                        photoViewer.f30950e0.invalidate();
                        photoViewer.f31102v3 = 4;
                        return;
                    }
                    photoViewer.f31102v3 = 4;
                    return;
                }
                return;
            case 7:
                zb0 zb0Var = (zb0) this.f1041c;
                if (!this.f1040b) {
                    org.telegram.ui.Cells.w8 w8Var = zb0Var.f40203n;
                    if (w8Var != null && w8Var.e.h) {
                        int i15 = -zb0Var.N;
                        zb0Var.N = i15;
                        AndroidUtilities.shakeViewSpring(w8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    boolean z21 = w8Var2.e.h;
                    w8Var2.setChecked(!z21);
                    zb0Var.Z(z21);
                    org.telegram.ui.Cells.w8 w8Var3 = zb0Var.f40203n;
                    if (w8Var3 != null) {
                        if (w8Var2.e.h) {
                            w8Var3.setChecked(false);
                            zb0Var.f40203n.setCheckBoxIcon(R.drawable.permission_locked);
                            zb0Var.f40204r.setVisibility(8);
                            return;
                        } else if (zb0Var.e == null) {
                            w8Var3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                xg0 xg0Var = (xg0) this.f1041c;
                boolean z22 = this.f1040b;
                yg0 yg0Var = xg0Var.V;
                if (yg0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !yg0Var.E;
                    yg0Var.E = z24;
                    ((org.telegram.ui.Cells.z1) view).c(z24, true);
                    if (((z22 && yg0Var.getConnectionsManager().isTestBackend()) ? false : false) != yg0Var.E) {
                        yg0Var.getConnectionsManager().switchBackend(false);
                    }
                    xg0Var.s();
                    return;
                }
                return;
        }
    }
}
