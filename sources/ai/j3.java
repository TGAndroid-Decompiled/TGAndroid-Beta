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
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
import org.telegram.ui.mu0;
import org.telegram.ui.pg0;
import org.telegram.ui.qg0;
import org.telegram.ui.rb0;
import org.telegram.ui.tq0;
import org.telegram.ui.ub1;
import org.telegram.ui.vu0;
import org.telegram.ui.wn;
import org.telegram.ui.xq0;
import org.telegram.ui.yq0;
import org.telegram.ui.zs0;
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
        nf nfVar;
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
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f1026c;
                boolean z15 = this.f1025b;
                org.telegram.ui.ActionBar.m1 m1Var = u0Var.d;
                if (m1Var != null && m1Var.isShowing() && z15) {
                    if (!u0Var.T) {
                        u0Var.T = true;
                        u0Var.d.d(u0Var.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.y yVar = u0Var.f19790c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.q0 q0Var = u0Var.P;
                if (q0Var != null) {
                    q0Var.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                ub1 ub1Var = (ub1) this.f1026c;
                boolean z16 = this.f1025b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) ub1Var.f38426b)[i13];
                    org.telegram.ui.Cells.x0 x0Var = y0Var.f21862a;
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
                td tdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z17 && (nfVar = chatActivityEnterView.L0) != null) {
                    nfVar.h(!S0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !S0;
                AndroidUtilities.cancelRunOnUIThread(tdVar);
                AndroidUtilities.runOnUIThread(tdVar, 500L);
                return;
            case 5:
                wi wiVar = (wi) this.f1026c;
                boolean z18 = this.f1025b;
                org.telegram.ui.ActionBar.m2 m2Var = wiVar.f30005f0;
                if (wiVar.Q0 != 0) {
                    wiVar.Z1.u0();
                    wiVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                yq0 yq0Var = new yq0(hashMap, arrayList, 0, true, (wn) m2Var);
                vh vhVar = new vh(wiVar, hashMap, arrayList);
                tq0 tq0Var = yq0Var.f40225a;
                tq0Var.f38212s0 = vhVar;
                tq0 tq0Var2 = yq0Var.f40226b;
                tq0Var2.f38212s0 = vhVar;
                tq0Var.f38213t0 = new xq0(yq0Var, 0);
                tq0Var2.f38213t0 = new xq0(yq0Var, 1);
                int i14 = wiVar.S1;
                boolean z19 = wiVar.T1;
                tq0Var.f0(i14, z19);
                yq0Var.f40226b.f0(i14, z19);
                if (z18) {
                    m2Var.showAsSheet(yq0Var);
                } else {
                    m2Var.presentFragment(yq0Var);
                }
                wiVar.dismiss();
                return;
            case 6:
                og0 og0Var = (og0) this.f1026c;
                boolean z20 = this.f1025b;
                og0Var.getClass();
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
                wu wuVar = og0Var.U;
                if (wuVar != null) {
                    wuVar.I();
                    return;
                }
                PhotoViewer photoViewer = og0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f31183a9 != null) {
                        PhotoViewer.f31183a9.G0(false, true);
                    }
                    au0 au0Var = photoViewer.f31232f0;
                    if (au0Var != null && au0Var.f22678f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                au0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        au0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) au0Var.f22678f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(au0Var.f22678f);
                        }
                        au0Var.addView(au0Var.f22678f, 0, w7.y5.e(-1, -1, 51));
                        og0.j(false);
                    }
                    PhotoViewer.f31183a9 = PhotoViewer.f31184b9;
                    PhotoViewer.f31184b9 = null;
                    if (photoViewer.f31232f0 == null) {
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
                    if (photoViewer.f31232f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f31404y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f31401y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f31232f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            sk0 o9 = og0.o(photoViewer.f31404y2.getAspectRatio(), false);
                            float f7 = o9.f28267c / photoViewer.f31395x3.getLayoutParams().width;
                            photoViewer.f31395x3.setScaleX(f7);
                            photoViewer.f31395x3.setScaleY(f7);
                            photoViewer.f31395x3.setTranslationX(o9.f28265a);
                            photoViewer.f31395x3.setTranslationY(o9.f28266b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o9.f28265a - photoViewer.f31404y2.getX());
                            view3.setTranslationY(o9.f28266b - photoViewer.f31404y2.getY());
                            mu0 mu0Var = photoViewer.E2;
                            if (mu0Var != null) {
                                mu0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            zs0 zs0Var = new zs0(photoViewer, f7, 1);
                            view3.setOutlineProvider(zs0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f31395x3.setOutlineProvider(zs0Var);
                            photoViewer.f31395x3.setClipToOutline(true);
                            mu0 mu0Var2 = photoViewer.E2;
                            if (mu0Var2 != null) {
                                mu0Var2.setOutlineProvider(zs0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            og0.j(true);
                        }
                    } else {
                        photoViewer.f31296m6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f31231f = true;
                        ((WindowManager) photoViewer.f31401y.getSystemService("window")).addView(photoViewer.f31240g0, photoViewer.f31214d0);
                        Activity activity = photoViewer.f31401y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f31101a1.add(photoViewer.f31346s1);
                        }
                        vu0 vu0Var = photoViewer.f31219d5;
                        if (vu0Var != null && !vu0Var.f38834s) {
                            vu0Var.f38819a.setVisible(false, false);
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
                        photoViewer.f31223e0.invalidate();
                        photoViewer.f31375v3 = 4;
                        return;
                    }
                    photoViewer.f31375v3 = 4;
                    return;
                }
                return;
            case 7:
                rb0 rb0Var = (rb0) this.f1026c;
                if (!this.f1025b) {
                    org.telegram.ui.Cells.w8 w8Var = rb0Var.f37285n;
                    if (w8Var != null && w8Var.e.h) {
                        int i15 = -rb0Var.N;
                        rb0Var.N = i15;
                        AndroidUtilities.shakeViewSpring(w8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    boolean z21 = w8Var2.e.h;
                    w8Var2.setChecked(!z21);
                    rb0Var.Z(z21);
                    org.telegram.ui.Cells.w8 w8Var3 = rb0Var.f37285n;
                    if (w8Var3 != null) {
                        if (w8Var2.e.h) {
                            w8Var3.setChecked(false);
                            rb0Var.f37285n.setCheckBoxIcon(R.drawable.permission_locked);
                            rb0Var.f37286r.setVisibility(8);
                            return;
                        } else if (rb0Var.e == null) {
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
                pg0 pg0Var = (pg0) this.f1026c;
                boolean z22 = this.f1025b;
                qg0 qg0Var = pg0Var.V;
                if (qg0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !qg0Var.E;
                    qg0Var.E = z24;
                    ((org.telegram.ui.Cells.a2) view).c(z24, true);
                    if (((z22 && qg0Var.getConnectionsManager().isTestBackend()) ? false : false) != qg0Var.E) {
                        qg0Var.getConnectionsManager().switchBackend(false);
                    }
                    pg0Var.s();
                    return;
                }
                return;
        }
    }
}
