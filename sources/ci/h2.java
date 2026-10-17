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
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.rd;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cb0;
import org.telegram.ui.cu0;
import org.telegram.ui.eg0;
import org.telegram.ui.fg0;
import org.telegram.ui.kq0;
import org.telegram.ui.lu0;
import org.telegram.ui.oq0;
import org.telegram.ui.pq0;
import org.telegram.ui.ps0;
import org.telegram.ui.qt0;
import org.telegram.ui.sa1;
import org.telegram.ui.sn;
public final class h2 implements View.OnClickListener {
    public final int f5452a;
    public final boolean f5453b;
    public final Object f5454c;

    public h2(int i10, Object obj, boolean z10) {
        this.f5452a = i10;
        this.f5454c = obj;
        this.f5453b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        mf mfVar;
        boolean z11;
        View view2;
        switch (this.f5452a) {
            case 0:
                q4 q4Var = (q4) this.f5454c;
                boolean z12 = this.f5453b;
                MessagesController.getInstance(q4Var.C2).setStoryQuality(!z12);
                xc xcVar = new xc(q4Var.f5771c1, q4Var.B0);
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
                h4 h4Var = q4Var.f5823t1;
                if (h4Var != null) {
                    h4Var.a();
                    return;
                }
                return;
            case 1:
                h4 h4Var2 = (h4) this.f5454c;
                boolean z13 = this.f5453b;
                h1 h1Var = h1.W;
                if (h1Var != null) {
                    boolean z14 = !z13;
                    if (h1Var.f5446n && h1Var.f5447r != z14) {
                        h1Var.f5447r = z14;
                        NativeInstance nativeInstance = h1Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                h4 h4Var3 = h4Var2.f5463l.f5823t1;
                if (h4Var3 != null) {
                    h4Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f5454c;
                boolean z15 = this.f5453b;
                org.telegram.ui.ActionBar.m1 m1Var = u0Var.d;
                if (m1Var != null && m1Var.isShowing() && z15) {
                    if (!u0Var.T) {
                        u0Var.T = true;
                        u0Var.d.d(u0Var.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.y yVar = u0Var.f21730c;
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
                sa1 sa1Var = (sa1) this.f5454c;
                boolean z16 = this.f5453b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.z0 z0Var = ((org.telegram.ui.Cells.z0[]) sa1Var.f41051b)[i13];
                    org.telegram.ui.Cells.y0 y0Var = z0Var.f23856a;
                    if (z0Var == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    y0Var.a(z10, true);
                }
                SharedConfig.setUseThreeLinesLayout(z16);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f5454c;
                boolean z17 = this.f5453b;
                rd rdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean Q0 = chatActivityEnterView.Q0();
                if (!z17 && (mfVar = chatActivityEnterView.L0) != null) {
                    mfVar.h(!Q0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !Q0;
                AndroidUtilities.cancelRunOnUIThread(rdVar);
                AndroidUtilities.runOnUIThread(rdVar, 500L);
                return;
            case 5:
                ti tiVar = (ti) this.f5454c;
                boolean z18 = this.f5453b;
                org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30574f0;
                if (tiVar.T0 != 0) {
                    tiVar.f30566c2.E();
                    tiVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                pq0 pq0Var = new pq0(hashMap, arrayList, 0, true, (sn) n2Var);
                th thVar = new th(tiVar, hashMap, arrayList);
                kq0 kq0Var = pq0Var.f40219a;
                kq0Var.f38661s0 = thVar;
                kq0 kq0Var2 = pq0Var.f40220b;
                kq0Var2.f38661s0 = thVar;
                kq0Var.f38662t0 = new oq0(pq0Var, 0);
                kq0Var2.f38662t0 = new oq0(pq0Var, 1);
                int i14 = tiVar.V1;
                boolean z19 = tiVar.W1;
                kq0Var.f0(i14, z19);
                pq0Var.f40220b.f0(i14, z19);
                if (z18) {
                    n2Var.showAsSheet(pq0Var);
                } else {
                    n2Var.presentFragment(pq0Var);
                }
                tiVar.dismiss();
                return;
            case 6:
                zg0 zg0Var = (zg0) this.f5454c;
                boolean z20 = this.f5453b;
                zg0Var.getClass();
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
                cv cvVar = zg0Var.U;
                if (cvVar != null) {
                    cvVar.I();
                    return;
                }
                PhotoViewer photoViewer = zg0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f33226a9 != null) {
                        PhotoViewer.f33226a9.G0(false, true);
                    }
                    qt0 qt0Var = photoViewer.f33275f0;
                    if (qt0Var != null && qt0Var.f27866f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                qt0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        qt0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) qt0Var.f27866f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(qt0Var.f27866f);
                        }
                        qt0Var.addView(qt0Var.f27866f, 0, w7.z5.e(-1, -1, 51));
                        zg0.j(false);
                    }
                    PhotoViewer.f33226a9 = PhotoViewer.f33227b9;
                    PhotoViewer.f33227b9 = null;
                    if (photoViewer.f33275f0 == null) {
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
                    if (photoViewer.f33275f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f33448y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f33445y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f33275f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            el0 o10 = zg0.o(photoViewer.f33448y2.getAspectRatio(), false);
                            float f7 = o10.f25958c / photoViewer.f33439x3.getLayoutParams().width;
                            photoViewer.f33439x3.setScaleX(f7);
                            photoViewer.f33439x3.setScaleY(f7);
                            photoViewer.f33439x3.setTranslationX(o10.f25956a);
                            photoViewer.f33439x3.setTranslationY(o10.f25957b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o10.f25956a - photoViewer.f33448y2.getX());
                            view3.setTranslationY(o10.f25957b - photoViewer.f33448y2.getY());
                            cu0 cu0Var = photoViewer.E2;
                            if (cu0Var != null) {
                                cu0Var.setScaleX(f7);
                                photoViewer.E2.setScaleY(f7);
                                photoViewer.E2.setTranslationX(view3.getTranslationX());
                                photoViewer.E2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.W = 0.0f;
                            ps0 ps0Var = new ps0(photoViewer, f7, 1);
                            view3.setOutlineProvider(ps0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f33439x3.setOutlineProvider(ps0Var);
                            photoViewer.f33439x3.setClipToOutline(true);
                            cu0 cu0Var2 = photoViewer.E2;
                            if (cu0Var2 != null) {
                                cu0Var2.setOutlineProvider(ps0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            zg0.j(true);
                        }
                    } else {
                        photoViewer.f33340m6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f33274f = true;
                        ((WindowManager) photoViewer.f33445y.getSystemService("window")).addView(photoViewer.f33283g0, photoViewer.f33257d0);
                        Activity activity = photoViewer.f33445y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f33144a1.add(photoViewer.f33390s1);
                        }
                        lu0 lu0Var = photoViewer.f33262d5;
                        if (lu0Var != null && !lu0Var.f38952s) {
                            lu0Var.f38937a.setVisible(false, false);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (photoViewer.D2) {
                        i2.g0 g0Var = photoViewer.F2.d;
                        if (g0Var != null) {
                            g0Var.z1(null);
                        }
                        photoViewer.F2.U(photoViewer.C2);
                        photoViewer.C2.setVisibility(4);
                        photoViewer.G3 = 2;
                        photoViewer.F3 = false;
                        photoViewer.f33266e0.invalidate();
                        photoViewer.f33419v3 = 4;
                        return;
                    }
                    photoViewer.f33419v3 = 4;
                    return;
                }
                return;
            case 7:
                cb0 cb0Var = (cb0) this.f5454c;
                if (!this.f5453b) {
                    org.telegram.ui.Cells.v8 v8Var = cb0Var.f35901n;
                    if (v8Var != null && v8Var.e.h) {
                        int i15 = -cb0Var.N;
                        cb0Var.N = i15;
                        AndroidUtilities.shakeViewSpring(v8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.v8 v8Var2 = (org.telegram.ui.Cells.v8) view;
                    boolean z21 = v8Var2.e.h;
                    v8Var2.setChecked(!z21);
                    cb0Var.Z(z21);
                    org.telegram.ui.Cells.v8 v8Var3 = cb0Var.f35901n;
                    if (v8Var3 != null) {
                        if (v8Var2.e.h) {
                            v8Var3.setChecked(false);
                            cb0Var.f35901n.setCheckBoxIcon(R.drawable.permission_locked);
                            cb0Var.f35902r.setVisibility(8);
                            return;
                        } else if (cb0Var.e == null) {
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
                eg0 eg0Var = (eg0) this.f5454c;
                boolean z22 = this.f5453b;
                fg0 fg0Var = eg0Var.V;
                if (fg0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !fg0Var.E;
                    fg0Var.E = z24;
                    ((org.telegram.ui.Cells.a2) view).c(z24, true);
                    if (((z22 && fg0Var.getConnectionsManager().isTestBackend()) ? false : false) != fg0Var.E) {
                        fg0Var.getConnectionsManager().switchBackend(false);
                    }
                    eg0Var.r();
                    return;
                }
                return;
        }
    }
}
