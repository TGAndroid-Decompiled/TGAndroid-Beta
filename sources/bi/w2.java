package bi;

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
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.sd;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.br0;
import org.telegram.ui.cc1;
import org.telegram.ui.co;
import org.telegram.ui.cv0;
import org.telegram.ui.fr0;
import org.telegram.ui.gr0;
import org.telegram.ui.gt0;
import org.telegram.ui.hu0;
import org.telegram.ui.tu0;
import org.telegram.ui.vg0;
import org.telegram.ui.wg0;
import org.telegram.ui.xb0;
public final class w2 implements View.OnClickListener {
    public final int f3965a;
    public final boolean f3966b;
    public final Object f3967c;

    public w2(int i10, Object obj, boolean z10) {
        this.f3965a = i10;
        this.f3967c = obj;
        this.f3966b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        nf nfVar;
        boolean z11;
        View view2;
        switch (this.f3965a) {
            case 0:
                o5 o5Var = (o5) this.f3967c;
                boolean z12 = this.f3966b;
                MessagesController.getInstance(o5Var.C2).setStoryQuality(!z12);
                yc ycVar = new yc(o5Var.f3436c1, o5Var.B0);
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
                f5 f5Var = o5Var.f3487t1;
                if (f5Var != null) {
                    f5Var.a();
                    return;
                }
                return;
            case 1:
                f5 f5Var2 = (f5) this.f3967c;
                boolean z13 = this.f3966b;
                t1 t1Var = t1.W;
                if (t1Var != null) {
                    boolean z14 = !z13;
                    if (t1Var.f3747n && t1Var.f3748r != z14) {
                        t1Var.f3748r = z14;
                        NativeInstance nativeInstance = t1Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                f5 f5Var3 = f5Var2.f2999l.f3487t1;
                if (f5Var3 != null) {
                    f5Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f3967c;
                boolean z15 = this.f3966b;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
                if (n1Var != null && n1Var.isShowing() && z15) {
                    if (!v0Var.T) {
                        v0Var.T = true;
                        v0Var.d.d(v0Var.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var.f21407c;
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
                cc1 cc1Var = (cc1) this.f3967c;
                boolean z16 = this.f3966b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) cc1Var.f35097b)[i13];
                    org.telegram.ui.Cells.x0 x0Var = y0Var.f23581a;
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
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3967c;
                boolean z17 = this.f3966b;
                sd sdVar = chatActivityEnterView.E4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z17 && (nfVar = chatActivityEnterView.L0) != null) {
                    nfVar.h(!S0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.D4 = !S0;
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                AndroidUtilities.runOnUIThread(sdVar, 500L);
                return;
            case 5:
                vi viVar = (vi) this.f3967c;
                boolean z18 = this.f3966b;
                org.telegram.ui.ActionBar.n2 n2Var = viVar.f31306f0;
                if (viVar.Q0 != 0) {
                    viVar.Z1.x();
                    viVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                gr0 gr0Var = new gr0(hashMap, arrayList, 0, true, (co) n2Var);
                uh uhVar = new uh(viVar, hashMap, arrayList);
                br0 br0Var = gr0Var.f36779a;
                br0Var.f34933s0 = uhVar;
                br0 br0Var2 = gr0Var.f36780b;
                br0Var2.f34933s0 = uhVar;
                br0Var.f34934t0 = new fr0(gr0Var, 0);
                br0Var2.f34934t0 = new fr0(gr0Var, 1);
                int i14 = viVar.S1;
                boolean z19 = viVar.T1;
                br0Var.f0(i14, z19);
                gr0Var.f36780b.f0(i14, z19);
                if (z18) {
                    n2Var.showAsSheet(gr0Var);
                } else {
                    n2Var.presentFragment(gr0Var);
                }
                viVar.dismiss();
                return;
            case 6:
                eg0 eg0Var = (eg0) this.f3967c;
                boolean z20 = this.f3966b;
                eg0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z20 && (!z11 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new lu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                tu tuVar = eg0Var.U;
                if (tuVar != null) {
                    tuVar.I();
                    return;
                }
                PhotoViewer photoViewer = eg0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.Z8 != null) {
                        PhotoViewer.Z8.G0(false, true);
                    }
                    hu0 hu0Var = photoViewer.f33585f0;
                    if (hu0Var != null && hu0Var.f29738f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                hu0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        hu0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) hu0Var.f29738f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(hu0Var.f29738f);
                        }
                        hu0Var.addView(hu0Var.f29738f, 0, w7.x5.e(-1, -1, 51));
                        eg0.j(false);
                    }
                    PhotoViewer.Z8 = PhotoViewer.f33536a9;
                    PhotoViewer.f33536a9 = null;
                    if (photoViewer.f33585f0 == null) {
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
                    if (photoViewer.f33585f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f33757y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f33754y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f33585f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            hk0 o9 = eg0.o(photoViewer.f33757y2.getAspectRatio(), false);
                            float f7 = o9.f26772c / photoViewer.f33748x3.getLayoutParams().width;
                            photoViewer.f33748x3.setScaleX(f7);
                            photoViewer.f33748x3.setScaleY(f7);
                            photoViewer.f33748x3.setTranslationX(o9.f26770a);
                            photoViewer.f33748x3.setTranslationY(o9.f26771b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o9.f26770a - photoViewer.f33757y2.getX());
                            view3.setTranslationY(o9.f26771b - photoViewer.f33757y2.getY());
                            tu0 tu0Var = photoViewer.E2;
                            if (tu0Var != null) {
                                tu0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            gt0 gt0Var = new gt0(photoViewer, f7, 1);
                            view3.setOutlineProvider(gt0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f33748x3.setOutlineProvider(gt0Var);
                            photoViewer.f33748x3.setClipToOutline(true);
                            tu0 tu0Var2 = photoViewer.E2;
                            if (tu0Var2 != null) {
                                tu0Var2.setOutlineProvider(gt0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            eg0.j(true);
                        }
                    } else {
                        photoViewer.f33649m6 = 0.0f;
                    }
                    try {
                        photoViewer.f33575e = true;
                        photoViewer.f33584f = true;
                        ((WindowManager) photoViewer.f33754y.getSystemService("window")).addView(photoViewer.f33593g0, photoViewer.f33566d0);
                        Activity activity = photoViewer.f33754y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f33451a1.add(photoViewer.f33699s1);
                        }
                        cv0 cv0Var = photoViewer.f33571d5;
                        if (cv0Var != null && !cv0Var.f35583s) {
                            cv0Var.f35567a.setVisible(false, false);
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
                        photoViewer.f33576e0.invalidate();
                        photoViewer.f33728v3 = 4;
                        return;
                    }
                    photoViewer.f33728v3 = 4;
                    return;
                }
                return;
            case 7:
                xb0 xb0Var = (xb0) this.f3967c;
                if (!this.f3966b) {
                    org.telegram.ui.Cells.w8 w8Var = xb0Var.f42703n;
                    if (w8Var != null && w8Var.f23517e.h) {
                        int i15 = -xb0Var.N;
                        xb0Var.N = i15;
                        AndroidUtilities.shakeViewSpring(w8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    boolean z21 = w8Var2.f23517e.h;
                    w8Var2.setChecked(!z21);
                    xb0Var.Z(z21);
                    org.telegram.ui.Cells.w8 w8Var3 = xb0Var.f42703n;
                    if (w8Var3 != null) {
                        if (w8Var2.f23517e.h) {
                            w8Var3.setChecked(false);
                            xb0Var.f42703n.setCheckBoxIcon(R.drawable.permission_locked);
                            xb0Var.f42704r.setVisibility(8);
                            return;
                        } else if (xb0Var.f42701e == null) {
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
                vg0 vg0Var = (vg0) this.f3967c;
                boolean z22 = this.f3966b;
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
