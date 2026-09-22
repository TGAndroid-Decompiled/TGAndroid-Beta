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
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.kf;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ar0;
import org.telegram.ui.bo;
import org.telegram.ui.cc1;
import org.telegram.ui.dv0;
import org.telegram.ui.fr0;
import org.telegram.ui.gr0;
import org.telegram.ui.ht0;
import org.telegram.ui.iu0;
import org.telegram.ui.uu0;
import org.telegram.ui.vg0;
import org.telegram.ui.wg0;
import org.telegram.ui.xb0;
public final class j3 implements View.OnClickListener {
    public final int f1036a;
    public final boolean f1037b;
    public final Object f1038c;

    public j3(int i10, Object obj, boolean z10) {
        this.f1036a = i10;
        this.f1038c = obj;
        this.f1037b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        kf kfVar;
        boolean z11;
        View view2;
        switch (this.f1036a) {
            case 0:
                f6 f6Var = (f6) this.f1038c;
                boolean z12 = this.f1037b;
                MessagesController.getInstance(f6Var.C2).setStoryQuality(!z12);
                vc vcVar = new vc(f6Var.f800c1, f6Var.B0);
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
                w5 w5Var = f6Var.f851t1;
                if (w5Var != null) {
                    w5Var.a();
                    return;
                }
                return;
            case 1:
                w5 w5Var2 = (w5) this.f1038c;
                boolean z13 = this.f1037b;
                d2 d2Var = d2.W;
                if (d2Var != null) {
                    boolean z14 = !z13;
                    if (d2Var.f689n && d2Var.f690r != z14) {
                        d2Var.f690r = z14;
                        NativeInstance nativeInstance = d2Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                w5 w5Var3 = w5Var2.f1655l.f851t1;
                if (w5Var3 != null) {
                    w5Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f1038c;
                boolean z15 = this.f1037b;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
                if (n1Var != null && n1Var.isShowing() && z15) {
                    if (!v0Var.T) {
                        v0Var.T = true;
                        v0Var.d.d(v0Var.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var.f19576c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.r0 r0Var = v0Var.P;
                if (r0Var != null) {
                    r0Var.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                cc1 cc1Var = (cc1) this.f1038c;
                boolean z16 = this.f1037b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) cc1Var.f32753b)[i13];
                    org.telegram.ui.Cells.x0 x0Var = y0Var.f21638a;
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
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1038c;
                boolean z17 = this.f1037b;
                qd qdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView.T0();
                if (!z17 && (kfVar = chatActivityEnterView.L0) != null) {
                    kfVar.h(!T0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !T0;
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                AndroidUtilities.runOnUIThread(qdVar, 500L);
                return;
            case 5:
                vi viVar = (vi) this.f1038c;
                boolean z18 = this.f1037b;
                org.telegram.ui.ActionBar.n2 n2Var = viVar.f28747f0;
                if (viVar.Q0 != 0) {
                    viVar.Z1.u0();
                    viVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                gr0 gr0Var = new gr0(hashMap, arrayList, 0, true, (bo) n2Var);
                uh uhVar = new uh(viVar, hashMap, arrayList);
                ar0 ar0Var = gr0Var.f33923a;
                ar0Var.f31917s0 = uhVar;
                ar0 ar0Var2 = gr0Var.f33924b;
                ar0Var2.f31917s0 = uhVar;
                ar0Var.f31918t0 = new fr0(gr0Var, 0);
                ar0Var2.f31918t0 = new fr0(gr0Var, 1);
                int i14 = viVar.S1;
                boolean z19 = viVar.T1;
                ar0Var.f0(i14, z19);
                gr0Var.f33924b.f0(i14, z19);
                if (z18) {
                    n2Var.showAsSheet(gr0Var);
                } else {
                    n2Var.presentFragment(gr0Var);
                }
                viVar.dismiss();
                return;
            case 6:
                eg0 eg0Var = (eg0) this.f1038c;
                boolean z20 = this.f1037b;
                eg0Var.getClass();
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
                vu vuVar = eg0Var.U;
                if (vuVar != null) {
                    vuVar.I();
                    return;
                }
                PhotoViewer photoViewer = eg0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f30894a9 != null) {
                        PhotoViewer.f30894a9.G0(false, true);
                    }
                    iu0 iu0Var = photoViewer.f30943f0;
                    if (iu0Var != null && iu0Var.f27322f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                iu0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        iu0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) iu0Var.f27322f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(iu0Var.f27322f);
                        }
                        iu0Var.addView(iu0Var.f27322f, 0, w7.x5.e(-1, -1, 51));
                        eg0.j(false);
                    }
                    PhotoViewer.f30894a9 = PhotoViewer.f30895b9;
                    PhotoViewer.f30895b9 = null;
                    if (photoViewer.f30943f0 == null) {
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
                    if (photoViewer.f30943f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f31115y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f31112y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f30943f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            hk0 o9 = eg0.o(photoViewer.f31115y2.getAspectRatio(), false);
                            float f7 = o9.f24714c / photoViewer.f31106x3.getLayoutParams().width;
                            photoViewer.f31106x3.setScaleX(f7);
                            photoViewer.f31106x3.setScaleY(f7);
                            photoViewer.f31106x3.setTranslationX(o9.f24712a);
                            photoViewer.f31106x3.setTranslationY(o9.f24713b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o9.f24712a - photoViewer.f31115y2.getX());
                            view3.setTranslationY(o9.f24713b - photoViewer.f31115y2.getY());
                            uu0 uu0Var = photoViewer.E2;
                            if (uu0Var != null) {
                                uu0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            ht0 ht0Var = new ht0(photoViewer, f7, 1);
                            view3.setOutlineProvider(ht0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f31106x3.setOutlineProvider(ht0Var);
                            photoViewer.f31106x3.setClipToOutline(true);
                            uu0 uu0Var2 = photoViewer.E2;
                            if (uu0Var2 != null) {
                                uu0Var2.setOutlineProvider(ht0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            eg0.j(true);
                        }
                    } else {
                        photoViewer.f31007m6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f30942f = true;
                        ((WindowManager) photoViewer.f31112y.getSystemService("window")).addView(photoViewer.f30951g0, photoViewer.f30925d0);
                        Activity activity = photoViewer.f31112y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f30812a1.add(photoViewer.f31057s1);
                        }
                        dv0 dv0Var = photoViewer.f30930d5;
                        if (dv0Var != null && !dv0Var.f33111s) {
                            dv0Var.f33096a.setVisible(false, false);
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
                        photoViewer.f30934e0.invalidate();
                        photoViewer.f31086v3 = 4;
                        return;
                    }
                    photoViewer.f31086v3 = 4;
                    return;
                }
                return;
            case 7:
                xb0 xb0Var = (xb0) this.f1038c;
                if (!this.f1037b) {
                    org.telegram.ui.Cells.w8 w8Var = xb0Var.f39580n;
                    if (w8Var != null && w8Var.e.h) {
                        int i15 = -xb0Var.N;
                        xb0Var.N = i15;
                        AndroidUtilities.shakeViewSpring(w8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    boolean z21 = w8Var2.e.h;
                    w8Var2.setChecked(!z21);
                    xb0Var.Z(z21);
                    org.telegram.ui.Cells.w8 w8Var3 = xb0Var.f39580n;
                    if (w8Var3 != null) {
                        if (w8Var2.e.h) {
                            w8Var3.setChecked(false);
                            xb0Var.f39580n.setCheckBoxIcon(R.drawable.permission_locked);
                            xb0Var.f39581r.setVisibility(8);
                            return;
                        } else if (xb0Var.e == null) {
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
                vg0 vg0Var = (vg0) this.f1038c;
                boolean z22 = this.f1037b;
                wg0 wg0Var = vg0Var.V;
                if (wg0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !wg0Var.E;
                    wg0Var.E = z24;
                    ((org.telegram.ui.Cells.z1) view).c(z24, true);
                    if (((z22 && wg0Var.getConnectionsManager().isTestBackend()) ? false : false) != wg0Var.E) {
                        wg0Var.getConnectionsManager().switchBackend(false);
                    }
                    vg0Var.s();
                    return;
                }
                return;
        }
    }
}
