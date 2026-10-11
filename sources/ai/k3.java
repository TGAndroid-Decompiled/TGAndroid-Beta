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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.vd;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.yi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ar0;
import org.telegram.ui.cc1;
import org.telegram.ui.dv0;
import org.telegram.ui.er0;
import org.telegram.ui.fr0;
import org.telegram.ui.gt0;
import org.telegram.ui.iu0;
import org.telegram.ui.ub0;
import org.telegram.ui.ug0;
import org.telegram.ui.uu0;
import org.telegram.ui.vg0;
import org.telegram.ui.zn;
public final class k3 implements View.OnClickListener {
    public final int f1219a;
    public final boolean f1220b;
    public final Object f1221c;

    public k3(int i10, Object obj, boolean z10) {
        this.f1219a = i10;
        this.f1221c = obj;
        this.f1220b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        pf pfVar;
        boolean z11;
        View view2;
        switch (this.f1219a) {
            case 0:
                f6 f6Var = (f6) this.f1221c;
                boolean z12 = this.f1220b;
                MessagesController.getInstance(f6Var.C2).setStoryQuality(!z12);
                ad adVar = new ad(f6Var.f955c1, f6Var.B0);
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
                adVar.M(string, LocaleController.getString(i11), i12).j();
                w5 w5Var = f6Var.f1006t1;
                if (w5Var != null) {
                    w5Var.a();
                    return;
                }
                return;
            case 1:
                w5 w5Var2 = (w5) this.f1221c;
                boolean z13 = this.f1220b;
                d2 d2Var = d2.W;
                if (d2Var != null) {
                    boolean z14 = !z13;
                    if (d2Var.f811n && d2Var.f812r != z14) {
                        d2Var.f812r = z14;
                        NativeInstance nativeInstance = d2Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                w5 w5Var3 = w5Var2.f1860l.f1006t1;
                if (w5Var3 != null) {
                    w5Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f1221c;
                boolean z15 = this.f1220b;
                org.telegram.ui.ActionBar.m1 m1Var = u0Var.d;
                if (m1Var != null && m1Var.isShowing() && z15) {
                    if (!u0Var.T) {
                        u0Var.T = true;
                        u0Var.d.d(u0Var.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.y yVar = u0Var.f21573c;
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
                cc1 cc1Var = (cc1) this.f1221c;
                boolean z16 = this.f1220b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) cc1Var.f36699b)[i13];
                    org.telegram.ui.Cells.x0 x0Var = y0Var.f23781a;
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
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1221c;
                boolean z17 = this.f1220b;
                vd vdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean Q0 = chatActivityEnterView.Q0();
                if (!z17 && (pfVar = chatActivityEnterView.L0) != null) {
                    pfVar.h(!Q0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !Q0;
                AndroidUtilities.cancelRunOnUIThread(vdVar);
                AndroidUtilities.runOnUIThread(vdVar, 500L);
                return;
            case 5:
                yi yiVar = (yi) this.f1221c;
                boolean z18 = this.f1220b;
                org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33289f0;
                if (yiVar.T0 != 0) {
                    yiVar.f33280c2.B0();
                    yiVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                fr0 fr0Var = new fr0(hashMap, arrayList, 0, true, (zn) m2Var);
                xh xhVar = new xh(yiVar, hashMap, arrayList);
                ar0 ar0Var = fr0Var.f37780a;
                ar0Var.f36192s0 = xhVar;
                ar0 ar0Var2 = fr0Var.f37781b;
                ar0Var2.f36192s0 = xhVar;
                ar0Var.f36193t0 = new er0(fr0Var, 0);
                ar0Var2.f36193t0 = new er0(fr0Var, 1);
                int i14 = yiVar.V1;
                boolean z19 = yiVar.W1;
                ar0Var.f0(i14, z19);
                fr0Var.f37781b.f0(i14, z19);
                if (z18) {
                    m2Var.showAsSheet(fr0Var);
                } else {
                    m2Var.presentFragment(fr0Var);
                }
                yiVar.dismiss();
                return;
            case 6:
                hh0 hh0Var = (hh0) this.f1221c;
                boolean z20 = this.f1220b;
                hh0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z20 && (!z11 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new ev(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                mv mvVar = hh0Var.U;
                if (mvVar != null) {
                    mvVar.I();
                    return;
                }
                PhotoViewer photoViewer = hh0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f33925a9 != null) {
                        PhotoViewer.f33925a9.G0(false, true);
                    }
                    iu0 iu0Var = photoViewer.f33975f0;
                    if (iu0Var != null && iu0Var.f31243f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                iu0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        iu0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) iu0Var.f31243f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(iu0Var.f31243f);
                        }
                        iu0Var.addView(iu0Var.f31243f, 0, w7.x5.e(-1, -1, 51));
                        hh0.j(false);
                    }
                    PhotoViewer.f33925a9 = PhotoViewer.f33926b9;
                    PhotoViewer.f33926b9 = null;
                    if (photoViewer.f33975f0 == null) {
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
                    if (photoViewer.f33975f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f34147y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f34144y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f33975f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            nl0 o9 = hh0.o(photoViewer.f34147y2.getAspectRatio(), false);
                            float f7 = o9.f29190c / photoViewer.f34138x3.getLayoutParams().width;
                            photoViewer.f34138x3.setScaleX(f7);
                            photoViewer.f34138x3.setScaleY(f7);
                            photoViewer.f34138x3.setTranslationX(o9.f29188a);
                            photoViewer.f34138x3.setTranslationY(o9.f29189b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o9.f29188a - photoViewer.f34147y2.getX());
                            view3.setTranslationY(o9.f29189b - photoViewer.f34147y2.getY());
                            uu0 uu0Var = photoViewer.E2;
                            if (uu0Var != null) {
                                uu0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            gt0 gt0Var = new gt0(photoViewer, f7, 1);
                            view3.setOutlineProvider(gt0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f34138x3.setOutlineProvider(gt0Var);
                            photoViewer.f34138x3.setClipToOutline(true);
                            uu0 uu0Var2 = photoViewer.E2;
                            if (uu0Var2 != null) {
                                uu0Var2.setOutlineProvider(gt0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            hh0.j(true);
                        }
                    } else {
                        photoViewer.f34039m6 = 0.0f;
                    }
                    try {
                        photoViewer.f33965e = true;
                        photoViewer.f33974f = true;
                        ((WindowManager) photoViewer.f34144y.getSystemService("window")).addView(photoViewer.f33983g0, photoViewer.f33956d0);
                        Activity activity = photoViewer.f34144y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f33840a1.add(photoViewer.f34089s1);
                        }
                        dv0 dv0Var = photoViewer.f33961d5;
                        if (dv0Var != null && !dv0Var.f37163s) {
                            dv0Var.f37147a.setVisible(false, false);
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    if (photoViewer.D2) {
                        i2.f0 f0Var = photoViewer.F2.d;
                        if (f0Var != null) {
                            f0Var.x1(null);
                        }
                        photoViewer.F2.U(photoViewer.C2);
                        photoViewer.C2.setVisibility(4);
                        photoViewer.G3 = 2;
                        photoViewer.F3 = false;
                        photoViewer.f33966e0.invalidate();
                        photoViewer.f34118v3 = 4;
                        return;
                    }
                    photoViewer.f34118v3 = 4;
                    return;
                }
                return;
            case 7:
                ub0 ub0Var = (ub0) this.f1221c;
                if (!this.f1220b) {
                    org.telegram.ui.Cells.w8 w8Var = ub0Var.f42543n;
                    if (w8Var != null && w8Var.f23716e.h) {
                        int i15 = -ub0Var.N;
                        ub0Var.N = i15;
                        AndroidUtilities.shakeViewSpring(w8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    boolean z21 = w8Var2.f23716e.h;
                    w8Var2.setChecked(!z21);
                    ub0Var.Z(z21);
                    org.telegram.ui.Cells.w8 w8Var3 = ub0Var.f42543n;
                    if (w8Var3 != null) {
                        if (w8Var2.f23716e.h) {
                            w8Var3.setChecked(false);
                            ub0Var.f42543n.setCheckBoxIcon(R.drawable.permission_locked);
                            ub0Var.f42544r.setVisibility(8);
                            return;
                        } else if (ub0Var.f42541e == null) {
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
                ug0 ug0Var = (ug0) this.f1221c;
                boolean z22 = this.f1220b;
                vg0 vg0Var = ug0Var.V;
                if (vg0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !vg0Var.E;
                    vg0Var.E = z24;
                    ((org.telegram.ui.Cells.a2) view).c(z24, true);
                    if (((z22 && vg0Var.getConnectionsManager().isTestBackend()) ? false : false) != vg0Var.E) {
                        vg0Var.getConnectionsManager().switchBackend(false);
                    }
                    ug0Var.r();
                    return;
                }
                return;
        }
    }
}
