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
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.sd;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ar0;
import org.telegram.ui.br0;
import org.telegram.ui.ct0;
import org.telegram.ui.du0;
import org.telegram.ui.pu0;
import org.telegram.ui.sg0;
import org.telegram.ui.tg0;
import org.telegram.ui.ub0;
import org.telegram.ui.ub1;
import org.telegram.ui.wq0;
import org.telegram.ui.xn;
import org.telegram.ui.yu0;
public final class j3 implements View.OnClickListener {
    public final int f1027a;
    public final boolean f1028b;
    public final Object f1029c;

    public j3(int i10, Object obj, boolean z10) {
        this.f1027a = i10;
        this.f1029c = obj;
        this.f1028b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        nf nfVar;
        boolean z11;
        View view2;
        switch (this.f1027a) {
            case 0:
                e6 e6Var = (e6) this.f1029c;
                boolean z12 = this.f1028b;
                MessagesController.getInstance(e6Var.C2).setStoryQuality(!z12);
                xc xcVar = new xc(e6Var.f779c1, e6Var.B0);
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
                v5 v5Var = e6Var.f830t1;
                if (v5Var != null) {
                    v5Var.a();
                    return;
                }
                return;
            case 1:
                v5 v5Var2 = (v5) this.f1029c;
                boolean z13 = this.f1028b;
                d2 d2Var = d2.W;
                if (d2Var != null) {
                    boolean z14 = !z13;
                    if (d2Var.f701n && d2Var.f702r != z14) {
                        d2Var.f702r = z14;
                        NativeInstance nativeInstance = d2Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                v5 v5Var3 = v5Var2.f1614l.f830t1;
                if (v5Var3 != null) {
                    v5Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f1029c;
                boolean z15 = this.f1028b;
                org.telegram.ui.ActionBar.o1 o1Var = w0Var.d;
                if (o1Var != null && o1Var.isShowing() && z15) {
                    if (!w0Var.T) {
                        w0Var.T = true;
                        w0Var.d.d(w0Var.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.a0 a0Var = w0Var.f19840c;
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
                ub1 ub1Var = (ub1) this.f1029c;
                boolean z16 = this.f1028b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) ub1Var.f38204b)[i13];
                    org.telegram.ui.Cells.x0 x0Var = y0Var.f21865a;
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
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1029c;
                boolean z17 = this.f1028b;
                sd sdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z17 && (nfVar = chatActivityEnterView.L0) != null) {
                    nfVar.h(!S0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !S0;
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                AndroidUtilities.runOnUIThread(sdVar, 500L);
                return;
            case 5:
                wi wiVar = (wi) this.f1029c;
                boolean z18 = this.f1028b;
                org.telegram.ui.ActionBar.o2 o2Var = wiVar.f29962f0;
                if (wiVar.Q0 != 0) {
                    wiVar.Z1.u0();
                    wiVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                br0 br0Var = new br0(hashMap, arrayList, 0, true, (xn) o2Var);
                li liVar = new li(wiVar, hashMap, arrayList);
                wq0 wq0Var = br0Var.f32419a;
                wq0Var.f39435s0 = liVar;
                wq0 wq0Var2 = br0Var.f32420b;
                wq0Var2.f39435s0 = liVar;
                wq0Var.f39436t0 = new ar0(br0Var, 0);
                wq0Var2.f39436t0 = new ar0(br0Var, 1);
                int i14 = wiVar.S1;
                boolean z19 = wiVar.T1;
                wq0Var.f0(i14, z19);
                br0Var.f32420b.f0(i14, z19);
                if (z18) {
                    o2Var.showAsSheet(br0Var);
                } else {
                    o2Var.presentFragment(br0Var);
                }
                wiVar.dismiss();
                return;
            case 6:
                rg0 rg0Var = (rg0) this.f1029c;
                boolean z20 = this.f1028b;
                rg0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z20 && (!z11 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new pu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                xu xuVar = rg0Var.U;
                if (xuVar != null) {
                    xuVar.I();
                    return;
                }
                PhotoViewer photoViewer = rg0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f31185a9 != null) {
                        PhotoViewer.f31185a9.G0(false, true);
                    }
                    du0 du0Var = photoViewer.f31234f0;
                    if (du0Var != null && du0Var.f23013f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                du0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        du0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) du0Var.f23013f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(du0Var.f23013f);
                        }
                        du0Var.addView(du0Var.f23013f, 0, w7.y5.e(-1, -1, 51));
                        rg0.j(false);
                    }
                    PhotoViewer.f31185a9 = PhotoViewer.f31186b9;
                    PhotoViewer.f31186b9 = null;
                    if (photoViewer.f31234f0 == null) {
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
                    if (photoViewer.f31234f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f31406y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f31403y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f31234f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            uk0 o9 = rg0.o(photoViewer.f31406y2.getAspectRatio(), false);
                            float f7 = o9.f28896c / photoViewer.f31397x3.getLayoutParams().width;
                            photoViewer.f31397x3.setScaleX(f7);
                            photoViewer.f31397x3.setScaleY(f7);
                            photoViewer.f31397x3.setTranslationX(o9.f28894a);
                            photoViewer.f31397x3.setTranslationY(o9.f28895b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o9.f28894a - photoViewer.f31406y2.getX());
                            view3.setTranslationY(o9.f28895b - photoViewer.f31406y2.getY());
                            pu0 pu0Var = photoViewer.E2;
                            if (pu0Var != null) {
                                pu0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            ct0 ct0Var = new ct0(photoViewer, f7, 1);
                            view3.setOutlineProvider(ct0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f31397x3.setOutlineProvider(ct0Var);
                            photoViewer.f31397x3.setClipToOutline(true);
                            pu0 pu0Var2 = photoViewer.E2;
                            if (pu0Var2 != null) {
                                pu0Var2.setOutlineProvider(ct0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            rg0.j(true);
                        }
                    } else {
                        photoViewer.f31298m6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f31233f = true;
                        ((WindowManager) photoViewer.f31403y.getSystemService("window")).addView(photoViewer.f31242g0, photoViewer.f31216d0);
                        Activity activity = photoViewer.f31403y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f31103a1.add(photoViewer.f31348s1);
                        }
                        yu0 yu0Var = photoViewer.f31221d5;
                        if (yu0Var != null && !yu0Var.f40340s) {
                            yu0Var.f40325a.setVisible(false, false);
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
                        photoViewer.f31225e0.invalidate();
                        photoViewer.f31377v3 = 4;
                        return;
                    }
                    photoViewer.f31377v3 = 4;
                    return;
                }
                return;
            case 7:
                ub0 ub0Var = (ub0) this.f1029c;
                if (!this.f1028b) {
                    org.telegram.ui.Cells.w8 w8Var = ub0Var.f38197n;
                    if (w8Var != null && w8Var.e.h) {
                        int i15 = -ub0Var.N;
                        ub0Var.N = i15;
                        AndroidUtilities.shakeViewSpring(w8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    boolean z21 = w8Var2.e.h;
                    w8Var2.setChecked(!z21);
                    ub0Var.Z(z21);
                    org.telegram.ui.Cells.w8 w8Var3 = ub0Var.f38197n;
                    if (w8Var3 != null) {
                        if (w8Var2.e.h) {
                            w8Var3.setChecked(false);
                            ub0Var.f38197n.setCheckBoxIcon(R.drawable.permission_locked);
                            ub0Var.f38198r.setVisibility(8);
                            return;
                        } else if (ub0Var.e == null) {
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
                sg0 sg0Var = (sg0) this.f1029c;
                boolean z22 = this.f1028b;
                tg0 tg0Var = sg0Var.V;
                if (tg0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !tg0Var.E;
                    tg0Var.E = z24;
                    ((org.telegram.ui.Cells.a2) view).c(z24, true);
                    if (((z22 && tg0Var.getConnectionsManager().isTestBackend()) ? false : false) != tg0Var.E) {
                        tg0Var.getConnectionsManager().switchBackend(false);
                    }
                    sg0Var.s();
                    return;
                }
                return;
        }
    }
}
