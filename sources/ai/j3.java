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
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ar0;
import org.telegram.ui.br0;
import org.telegram.ui.ct0;
import org.telegram.ui.du0;
import org.telegram.ui.pu0;
import org.telegram.ui.tg0;
import org.telegram.ui.ug0;
import org.telegram.ui.vb0;
import org.telegram.ui.wq0;
import org.telegram.ui.xb1;
import org.telegram.ui.yn;
import org.telegram.ui.yu0;
public final class j3 implements View.OnClickListener {
    public final int f1110a;
    public final boolean f1111b;
    public final Object f1112c;

    public j3(int i10, Object obj, boolean z10) {
        this.f1110a = i10;
        this.f1112c = obj;
        this.f1111b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        of ofVar;
        boolean z11;
        View view2;
        switch (this.f1110a) {
            case 0:
                e6 e6Var = (e6) this.f1112c;
                boolean z12 = this.f1111b;
                MessagesController.getInstance(e6Var.C2).setStoryQuality(!z12);
                yc ycVar = new yc(e6Var.f844c1, e6Var.B0);
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
                ycVar.M(string, LocaleController.getString(i11), i12).j();
                v5 v5Var = e6Var.f895t1;
                if (v5Var != null) {
                    v5Var.a();
                    return;
                }
                return;
            case 1:
                v5 v5Var2 = (v5) this.f1112c;
                boolean z13 = this.f1111b;
                d2 d2Var = d2.W;
                if (d2Var != null) {
                    boolean z14 = !z13;
                    if (d2Var.f758n && d2Var.f759r != z14) {
                        d2Var.f759r = z14;
                        NativeInstance nativeInstance = d2Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                v5 v5Var3 = v5Var2.f1756l.f895t1;
                if (v5Var3 != null) {
                    v5Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f1112c;
                boolean z15 = this.f1111b;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
                if (n1Var != null && n1Var.isShowing() && z15) {
                    if (!v0Var.T) {
                        v0Var.T = true;
                        v0Var.d.d(v0Var.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var.f21572c;
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
                xb1 xb1Var = (xb1) this.f1112c;
                boolean z16 = this.f1111b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) xb1Var.f42826b)[i13];
                    org.telegram.ui.Cells.x0 x0Var = y0Var.f23744a;
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
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1112c;
                boolean z17 = this.f1111b;
                td tdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z17 && (ofVar = chatActivityEnterView.L0) != null) {
                    ofVar.h(!S0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !S0;
                AndroidUtilities.cancelRunOnUIThread(tdVar);
                AndroidUtilities.runOnUIThread(tdVar, 500L);
                return;
            case 5:
                xi xiVar = (xi) this.f1112c;
                boolean z18 = this.f1111b;
                org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32812f0;
                if (xiVar.Q0 != 0) {
                    xiVar.Z1.u0();
                    xiVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                br0 br0Var = new br0(hashMap, arrayList, 0, true, (yn) n2Var);
                mi miVar = new mi(xiVar, hashMap, arrayList);
                wq0 wq0Var = br0Var.f35175a;
                wq0Var.f42617s0 = miVar;
                wq0 wq0Var2 = br0Var.f35176b;
                wq0Var2.f42617s0 = miVar;
                wq0Var.f42618t0 = new ar0(br0Var, 0);
                wq0Var2.f42618t0 = new ar0(br0Var, 1);
                int i14 = xiVar.S1;
                boolean z19 = xiVar.T1;
                wq0Var.f0(i14, z19);
                br0Var.f35176b.f0(i14, z19);
                if (z18) {
                    n2Var.showAsSheet(br0Var);
                } else {
                    n2Var.presentFragment(br0Var);
                }
                xiVar.dismiss();
                return;
            case 6:
                rg0 rg0Var = (rg0) this.f1112c;
                boolean z20 = this.f1111b;
                rg0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z20 && (!z11 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new qu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                zu zuVar = rg0Var.U;
                if (zuVar != null) {
                    zuVar.G();
                    return;
                }
                PhotoViewer photoViewer = rg0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f33853a9 != null) {
                        PhotoViewer.f33853a9.G0(false, true);
                    }
                    du0 du0Var = photoViewer.f33903f0;
                    if (du0Var != null && du0Var.f25718f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                du0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        du0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) du0Var.f25718f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(du0Var.f25718f);
                        }
                        du0Var.addView(du0Var.f25718f, 0, w7.z5.e(-1, -1, 51));
                        rg0.j(false);
                    }
                    PhotoViewer.f33853a9 = PhotoViewer.f33854b9;
                    PhotoViewer.f33854b9 = null;
                    if (photoViewer.f33903f0 == null) {
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
                    if (photoViewer.f33903f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f34075y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f34072y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f33903f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            uk0 o9 = rg0.o(photoViewer.f34075y2.getAspectRatio(), false);
                            float f7 = o9.f31389c / photoViewer.f34066x3.getLayoutParams().width;
                            photoViewer.f34066x3.setScaleX(f7);
                            photoViewer.f34066x3.setScaleY(f7);
                            photoViewer.f34066x3.setTranslationX(o9.f31387a);
                            photoViewer.f34066x3.setTranslationY(o9.f31388b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o9.f31387a - photoViewer.f34075y2.getX());
                            view3.setTranslationY(o9.f31388b - photoViewer.f34075y2.getY());
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
                            photoViewer.f34066x3.setOutlineProvider(ct0Var);
                            photoViewer.f34066x3.setClipToOutline(true);
                            pu0 pu0Var2 = photoViewer.E2;
                            if (pu0Var2 != null) {
                                pu0Var2.setOutlineProvider(ct0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            rg0.j(true);
                        }
                    } else {
                        photoViewer.f33967m6 = 0.0f;
                    }
                    try {
                        photoViewer.f33893e = true;
                        photoViewer.f33902f = true;
                        ((WindowManager) photoViewer.f34072y.getSystemService("window")).addView(photoViewer.f33911g0, photoViewer.f33884d0);
                        Activity activity = photoViewer.f34072y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f33768a1.add(photoViewer.f34017s1);
                        }
                        yu0 yu0Var = photoViewer.f33889d5;
                        if (yu0Var != null && !yu0Var.f43635s) {
                            yu0Var.f43619a.setVisible(false, false);
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
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
                        photoViewer.f33894e0.invalidate();
                        photoViewer.f34046v3 = 4;
                        return;
                    }
                    photoViewer.f34046v3 = 4;
                    return;
                }
                return;
            case 7:
                vb0 vb0Var = (vb0) this.f1112c;
                if (!this.f1111b) {
                    org.telegram.ui.Cells.w8 w8Var = vb0Var.f41683n;
                    if (w8Var != null && w8Var.f23691e.h) {
                        int i15 = -vb0Var.N;
                        vb0Var.N = i15;
                        AndroidUtilities.shakeViewSpring(w8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    boolean z21 = w8Var2.f23691e.h;
                    w8Var2.setChecked(!z21);
                    vb0Var.Y(z21);
                    org.telegram.ui.Cells.w8 w8Var3 = vb0Var.f41683n;
                    if (w8Var3 != null) {
                        if (w8Var2.f23691e.h) {
                            w8Var3.setChecked(false);
                            vb0Var.f41683n.setCheckBoxIcon(R.drawable.permission_locked);
                            vb0Var.f41684r.setVisibility(8);
                            return;
                        } else if (vb0Var.f41681e == null) {
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
                tg0 tg0Var = (tg0) this.f1112c;
                boolean z22 = this.f1111b;
                ug0 ug0Var = tg0Var.V;
                if (ug0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !ug0Var.E;
                    ug0Var.E = z24;
                    ((org.telegram.ui.Cells.a2) view).c(z24, true);
                    if (((z22 && ug0Var.getConnectionsManager().isTestBackend()) ? false : false) != ug0Var.E) {
                        ug0Var.getConnectionsManager().switchBackend(false);
                    }
                    tg0Var.s();
                    return;
                }
                return;
        }
    }
}
