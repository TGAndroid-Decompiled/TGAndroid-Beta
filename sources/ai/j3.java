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
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.sd;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ar0;
import org.telegram.ui.at0;
import org.telegram.ui.bu0;
import org.telegram.ui.nu0;
import org.telegram.ui.qg0;
import org.telegram.ui.rg0;
import org.telegram.ui.sb0;
import org.telegram.ui.ub1;
import org.telegram.ui.uq0;
import org.telegram.ui.wu0;
import org.telegram.ui.xn;
import org.telegram.ui.zq0;
public final class j3 implements View.OnClickListener {
    public final int f1024a;
    public final boolean f1025b;
    public final Object f1026c;

    public j3(int i10, Object obj, boolean z10) {
        this.f1024a = i10;
        this.f1026c = obj;
        this.f1025b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        mf mfVar;
        boolean z11;
        View view2;
        switch (this.f1024a) {
            case 0:
                e6 e6Var = (e6) this.f1026c;
                boolean z12 = this.f1025b;
                MessagesController.getInstance(e6Var.C2).setStoryQuality(!z12);
                xc xcVar = new xc(e6Var.f776c1, e6Var.B0);
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
                xcVar.M(string, LocaleController.getString(i11), i12).j();
                v5 v5Var = e6Var.f827t1;
                if (v5Var != null) {
                    v5Var.a();
                    return;
                }
                return;
            case 1:
                v5 v5Var2 = (v5) this.f1026c;
                boolean z13 = this.f1025b;
                d2 d2Var = d2.W;
                if (d2Var != null) {
                    boolean z14 = !z13;
                    if (d2Var.f698n && d2Var.f699r != z14) {
                        d2Var.f699r = z14;
                        NativeInstance nativeInstance = d2Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                v5 v5Var3 = v5Var2.f1612l.f827t1;
                if (v5Var3 != null) {
                    v5Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f1026c;
                boolean z15 = this.f1025b;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
                if (n1Var != null && n1Var.isShowing() && z15) {
                    if (!v0Var.T) {
                        v0Var.T = true;
                        v0Var.d.d(v0Var.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var.f19563c;
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
                ub1 ub1Var = (ub1) this.f1026c;
                boolean z16 = this.f1025b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) ub1Var.f38047b)[i13];
                    org.telegram.ui.Cells.x0 x0Var = y0Var.f21619a;
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
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1026c;
                boolean z17 = this.f1025b;
                sd sdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView.T0();
                if (!z17 && (mfVar = chatActivityEnterView.L0) != null) {
                    mfVar.h(!T0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !T0;
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                AndroidUtilities.runOnUIThread(sdVar, 500L);
                return;
            case 5:
                wi wiVar = (wi) this.f1026c;
                boolean z18 = this.f1025b;
                org.telegram.ui.ActionBar.n2 n2Var = wiVar.f29665f0;
                if (wiVar.Q0 != 0) {
                    wiVar.Z1.u0();
                    wiVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                ar0 ar0Var = new ar0(hashMap, arrayList, 0, true, (xn) n2Var);
                vh vhVar = new vh(wiVar, hashMap, arrayList);
                uq0 uq0Var = ar0Var.f31867a;
                uq0Var.f38191s0 = vhVar;
                uq0 uq0Var2 = ar0Var.f31868b;
                uq0Var2.f38191s0 = vhVar;
                uq0Var.f38192t0 = new zq0(ar0Var, 0);
                uq0Var2.f38192t0 = new zq0(ar0Var, 1);
                int i14 = wiVar.S1;
                boolean z19 = wiVar.T1;
                uq0Var.f0(i14, z19);
                ar0Var.f31868b.f0(i14, z19);
                if (z18) {
                    n2Var.showAsSheet(ar0Var);
                } else {
                    n2Var.presentFragment(ar0Var);
                }
                wiVar.dismiss();
                return;
            case 6:
                eg0 eg0Var = (eg0) this.f1026c;
                boolean z20 = this.f1025b;
                eg0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z20 && (!z11 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new ou(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                wu wuVar = eg0Var.U;
                if (wuVar != null) {
                    wuVar.I();
                    return;
                }
                PhotoViewer photoViewer = eg0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f30868a9 != null) {
                        PhotoViewer.f30868a9.G0(false, true);
                    }
                    bu0 bu0Var = photoViewer.f30917f0;
                    if (bu0Var != null && bu0Var.f27332f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                bu0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        bu0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) bu0Var.f27332f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(bu0Var.f27332f);
                        }
                        bu0Var.addView(bu0Var.f27332f, 0, w7.x5.e(-1, -1, 51));
                        eg0.j(false);
                    }
                    PhotoViewer.f30868a9 = PhotoViewer.f30869b9;
                    PhotoViewer.f30869b9 = null;
                    if (photoViewer.f30917f0 == null) {
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
                    if (photoViewer.f30917f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f31089y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f31086y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f30917f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            ik0 o9 = eg0.o(photoViewer.f31089y2.getAspectRatio(), false);
                            float f7 = o9.f24990c / photoViewer.f31080x3.getLayoutParams().width;
                            photoViewer.f31080x3.setScaleX(f7);
                            photoViewer.f31080x3.setScaleY(f7);
                            photoViewer.f31080x3.setTranslationX(o9.f24988a);
                            photoViewer.f31080x3.setTranslationY(o9.f24989b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o9.f24988a - photoViewer.f31089y2.getX());
                            view3.setTranslationY(o9.f24989b - photoViewer.f31089y2.getY());
                            nu0 nu0Var = photoViewer.E2;
                            if (nu0Var != null) {
                                nu0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            at0 at0Var = new at0(photoViewer, f7, 1);
                            view3.setOutlineProvider(at0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f31080x3.setOutlineProvider(at0Var);
                            photoViewer.f31080x3.setClipToOutline(true);
                            nu0 nu0Var2 = photoViewer.E2;
                            if (nu0Var2 != null) {
                                nu0Var2.setOutlineProvider(at0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            eg0.j(true);
                        }
                    } else {
                        photoViewer.f30981m6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f30916f = true;
                        ((WindowManager) photoViewer.f31086y.getSystemService("window")).addView(photoViewer.f30925g0, photoViewer.f30899d0);
                        Activity activity = photoViewer.f31086y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f30786a1.add(photoViewer.f31031s1);
                        }
                        wu0 wu0Var = photoViewer.f30904d5;
                        if (wu0Var != null && !wu0Var.f39109s) {
                            wu0Var.f39094a.setVisible(false, false);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (photoViewer.D2) {
                        i2.f0 f0Var = photoViewer.F2.d;
                        if (f0Var != null) {
                            f0Var.v1(null);
                        }
                        photoViewer.F2.U(photoViewer.C2);
                        photoViewer.C2.setVisibility(4);
                        photoViewer.G3 = 2;
                        photoViewer.F3 = false;
                        photoViewer.f30908e0.invalidate();
                        photoViewer.f31060v3 = 4;
                        return;
                    }
                    photoViewer.f31060v3 = 4;
                    return;
                }
                return;
            case 7:
                sb0 sb0Var = (sb0) this.f1026c;
                if (!this.f1025b) {
                    org.telegram.ui.Cells.x8 x8Var = sb0Var.f37230n;
                    if (x8Var != null && x8Var.e.h) {
                        int i15 = -sb0Var.N;
                        sb0Var.N = i15;
                        AndroidUtilities.shakeViewSpring(x8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.x8 x8Var2 = (org.telegram.ui.Cells.x8) view;
                    boolean z21 = x8Var2.e.h;
                    x8Var2.setChecked(!z21);
                    sb0Var.Z(z21);
                    org.telegram.ui.Cells.x8 x8Var3 = sb0Var.f37230n;
                    if (x8Var3 != null) {
                        if (x8Var2.e.h) {
                            x8Var3.setChecked(false);
                            sb0Var.f37230n.setCheckBoxIcon(R.drawable.permission_locked);
                            sb0Var.f37231r.setVisibility(8);
                            return;
                        } else if (sb0Var.e == null) {
                            x8Var3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                qg0 qg0Var = (qg0) this.f1026c;
                boolean z22 = this.f1025b;
                rg0 rg0Var = qg0Var.V;
                if (rg0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !rg0Var.E;
                    rg0Var.E = z24;
                    ((org.telegram.ui.Cells.z1) view).c(z24, true);
                    if (((z22 && rg0Var.getConnectionsManager().isTestBackend()) ? false : false) != rg0Var.E) {
                        rg0Var.getConnectionsManager().switchBackend(false);
                    }
                    qg0Var.s();
                    return;
                }
                return;
        }
    }
}
