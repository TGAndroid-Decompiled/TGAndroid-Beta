package ci;

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
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.rd;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ab0;
import org.telegram.ui.au0;
import org.telegram.ui.cg0;
import org.telegram.ui.dg0;
import org.telegram.ui.jq0;
import org.telegram.ui.ju0;
import org.telegram.ui.nq0;
import org.telegram.ui.ns0;
import org.telegram.ui.oq0;
import org.telegram.ui.ot0;
import org.telegram.ui.qa1;
import org.telegram.ui.qn;
public final class h2 implements View.OnClickListener {
    public final int f5450a;
    public final boolean f5451b;
    public final Object f5452c;

    public h2(int i10, Object obj, boolean z10) {
        this.f5450a = i10;
        this.f5452c = obj;
        this.f5451b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        mf mfVar;
        boolean z11;
        View view2;
        switch (this.f5450a) {
            case 0:
                q4 q4Var = (q4) this.f5452c;
                boolean z12 = this.f5451b;
                MessagesController.getInstance(q4Var.C2).setStoryQuality(!z12);
                xc xcVar = new xc(q4Var.f5769c1, q4Var.B0);
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
                h4 h4Var = q4Var.f5821t1;
                if (h4Var != null) {
                    h4Var.a();
                    return;
                }
                return;
            case 1:
                h4 h4Var2 = (h4) this.f5452c;
                boolean z13 = this.f5451b;
                h1 h1Var = h1.W;
                if (h1Var != null) {
                    boolean z14 = !z13;
                    if (h1Var.f5444n && h1Var.f5445r != z14) {
                        h1Var.f5445r = z14;
                        NativeInstance nativeInstance = h1Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                h4 h4Var3 = h4Var2.f5461l.f5821t1;
                if (h4Var3 != null) {
                    h4Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f5452c;
                boolean z15 = this.f5451b;
                org.telegram.ui.ActionBar.m1 m1Var = u0Var.d;
                if (m1Var != null && m1Var.isShowing() && z15) {
                    if (!u0Var.T) {
                        u0Var.T = true;
                        u0Var.d.d(u0Var.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.y yVar = u0Var.f21734c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.q0 q0Var = u0Var.P;
                if (q0Var != null) {
                    q0Var.j(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                qa1 qa1Var = (qa1) this.f5452c;
                boolean z16 = this.f5451b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) qa1Var.f40519b)[i13];
                    org.telegram.ui.Cells.x0 x0Var = y0Var.f23831a;
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
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f5452c;
                boolean z17 = this.f5451b;
                rd rdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean Q0 = chatActivityEnterView.Q0();
                if (!z17 && (mfVar = chatActivityEnterView.L0) != null) {
                    mfVar.g(!Q0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !Q0;
                AndroidUtilities.cancelRunOnUIThread(rdVar);
                AndroidUtilities.runOnUIThread(rdVar, 500L);
                return;
            case 5:
                ti tiVar = (ti) this.f5452c;
                boolean z18 = this.f5451b;
                org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30546f0;
                if (tiVar.T0 != 0) {
                    tiVar.f30538c2.E();
                    tiVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                oq0 oq0Var = new oq0(hashMap, arrayList, 0, true, (qn) n2Var);
                th thVar = new th(tiVar, hashMap, arrayList);
                jq0 jq0Var = oq0Var.f39960a;
                jq0Var.f38325s0 = thVar;
                jq0 jq0Var2 = oq0Var.f39961b;
                jq0Var2.f38325s0 = thVar;
                jq0Var.f38326t0 = new nq0(oq0Var, 0);
                jq0Var2.f38326t0 = new nq0(oq0Var, 1);
                int i14 = tiVar.V1;
                boolean z19 = tiVar.W1;
                jq0Var.f0(i14, z19);
                oq0Var.f39961b.f0(i14, z19);
                if (z18) {
                    n2Var.showAsSheet(oq0Var);
                } else {
                    n2Var.presentFragment(oq0Var);
                }
                tiVar.dismiss();
                return;
            case 6:
                ah0 ah0Var = (ah0) this.f5452c;
                boolean z20 = this.f5451b;
                ah0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z20 && (!z11 || !LaunchActivity.F1)) {
                    LaunchActivity.G1 = new uu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                cv cvVar = ah0Var.U;
                if (cvVar != null) {
                    cvVar.I();
                    return;
                }
                PhotoViewer photoViewer = ah0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f33239a9 != null) {
                        PhotoViewer.f33239a9.H0(false, true);
                    }
                    ot0 ot0Var = photoViewer.f33288f0;
                    if (ot0Var != null && ot0Var.f28154f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                ot0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        ot0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) ot0Var.f28154f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(ot0Var.f28154f);
                        }
                        ot0Var.addView(ot0Var.f28154f, 0, w7.z5.e(-1, -1, 51));
                        ah0.j(false);
                    }
                    PhotoViewer.f33239a9 = PhotoViewer.f33240b9;
                    PhotoViewer.f33240b9 = null;
                    if (photoViewer.f33288f0 == null) {
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
                    if (photoViewer.f33288f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f33461y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f33458y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f33288f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            fl0 o10 = ah0.o(photoViewer.f33461y2.getAspectRatio(), false);
                            float f7 = o10.f26274c / photoViewer.f33452x3.getLayoutParams().width;
                            photoViewer.f33452x3.setScaleX(f7);
                            photoViewer.f33452x3.setScaleY(f7);
                            photoViewer.f33452x3.setTranslationX(o10.f26272a);
                            photoViewer.f33452x3.setTranslationY(o10.f26273b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o10.f26272a - photoViewer.f33461y2.getX());
                            view3.setTranslationY(o10.f26273b - photoViewer.f33461y2.getY());
                            au0 au0Var = photoViewer.E2;
                            if (au0Var != null) {
                                au0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            ns0 ns0Var = new ns0(photoViewer, f7, 1);
                            view3.setOutlineProvider(ns0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f33452x3.setOutlineProvider(ns0Var);
                            photoViewer.f33452x3.setClipToOutline(true);
                            au0 au0Var2 = photoViewer.E2;
                            if (au0Var2 != null) {
                                au0Var2.setOutlineProvider(ns0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            ah0.j(true);
                        }
                    } else {
                        photoViewer.f33353m6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f33287f = true;
                        ((WindowManager) photoViewer.f33458y.getSystemService("window")).addView(photoViewer.f33296g0, photoViewer.f33270d0);
                        Activity activity = photoViewer.f33458y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f33157a1.add(photoViewer.f33403s1);
                        }
                        ju0 ju0Var = photoViewer.f33275d5;
                        if (ju0Var != null && !ju0Var.f38366s) {
                            ju0Var.f38351a.setVisible(false, false);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (photoViewer.D2) {
                        i2.i0 i0Var = photoViewer.F2.d;
                        if (i0Var != null) {
                            i0Var.z1(null);
                        }
                        photoViewer.F2.U(photoViewer.C2);
                        photoViewer.C2.setVisibility(4);
                        photoViewer.G3 = 2;
                        photoViewer.F3 = false;
                        photoViewer.f33279e0.invalidate();
                        photoViewer.f33432v3 = 4;
                        return;
                    }
                    photoViewer.f33432v3 = 4;
                    return;
                }
                return;
            case 7:
                ab0 ab0Var = (ab0) this.f5452c;
                if (!this.f5451b) {
                    org.telegram.ui.Cells.v8 v8Var = ab0Var.f35332n;
                    if (v8Var != null && v8Var.e.h) {
                        int i15 = -ab0Var.N;
                        ab0Var.N = i15;
                        AndroidUtilities.shakeViewSpring(v8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.v8 v8Var2 = (org.telegram.ui.Cells.v8) view;
                    boolean z21 = v8Var2.e.h;
                    v8Var2.setChecked(!z21);
                    ab0Var.Z(z21);
                    org.telegram.ui.Cells.v8 v8Var3 = ab0Var.f35332n;
                    if (v8Var3 != null) {
                        if (v8Var2.e.h) {
                            v8Var3.setChecked(false);
                            ab0Var.f35332n.setCheckBoxIcon(R.drawable.permission_locked);
                            ab0Var.f35333r.setVisibility(8);
                            return;
                        } else if (ab0Var.e == null) {
                            v8Var3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                cg0 cg0Var = (cg0) this.f5452c;
                boolean z22 = this.f5451b;
                dg0 dg0Var = cg0Var.V;
                if (dg0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !dg0Var.E;
                    dg0Var.E = z24;
                    ((org.telegram.ui.Cells.a2) view).c(z24, true);
                    if (((z22 && dg0Var.getConnectionsManager().isTestBackend()) ? false : false) != dg0Var.E) {
                        dg0Var.getConnectionsManager().switchBackend(false);
                    }
                    cg0Var.r();
                    return;
                }
                return;
        }
    }
}
