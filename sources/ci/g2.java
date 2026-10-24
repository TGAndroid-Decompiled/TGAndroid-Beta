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
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.kf;
import org.telegram.ui.Components.pd;
import org.telegram.ui.Components.rh;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cu0;
import org.telegram.ui.gb0;
import org.telegram.ui.gg0;
import org.telegram.ui.hg0;
import org.telegram.ui.lq0;
import org.telegram.ui.lu0;
import org.telegram.ui.pq0;
import org.telegram.ui.ps0;
import org.telegram.ui.qq0;
import org.telegram.ui.qt0;
import org.telegram.ui.sn;
import org.telegram.ui.ua1;
public final class g2 implements View.OnClickListener {
    public final int f5348a;
    public final boolean f5349b;
    public final Object f5350c;

    public g2(int i10, Object obj, boolean z10) {
        this.f5348a = i10;
        this.f5350c = obj;
        this.f5349b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        kf kfVar;
        boolean z11;
        View view2;
        switch (this.f5348a) {
            case 0:
                p4 p4Var = (p4) this.f5350c;
                boolean z12 = this.f5349b;
                MessagesController.getInstance(p4Var.C2).setStoryQuality(!z12);
                vc vcVar = new vc(p4Var.f5656c1, p4Var.B0);
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
                g4 g4Var = p4Var.f5708t1;
                if (g4Var != null) {
                    g4Var.a();
                    return;
                }
                return;
            case 1:
                g4 g4Var2 = (g4) this.f5350c;
                boolean z13 = this.f5349b;
                h1 h1Var = h1.W;
                if (h1Var != null) {
                    boolean z14 = !z13;
                    if (h1Var.f5383n && h1Var.f5384r != z14) {
                        h1Var.f5384r = z14;
                        NativeInstance nativeInstance = h1Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                g4 g4Var3 = g4Var2.f5359l.f5708t1;
                if (g4Var3 != null) {
                    g4Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f5350c;
                boolean z15 = this.f5349b;
                org.telegram.ui.ActionBar.m1 m1Var = u0Var.d;
                if (m1Var != null && m1Var.isShowing() && z15) {
                    if (!u0Var.T) {
                        u0Var.T = true;
                        u0Var.d.d(u0Var.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.y yVar = u0Var.f21877c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.q0 q0Var = u0Var.P;
                if (q0Var != null) {
                    q0Var.h(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                ua1 ua1Var = (ua1) this.f5350c;
                boolean z16 = this.f5349b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) ua1Var.f42365b)[i13];
                    org.telegram.ui.Cells.w0 w0Var = x0Var.f23941a;
                    if (x0Var == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    w0Var.a(z10, true);
                }
                SharedConfig.setUseThreeLinesLayout(z16);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f5350c;
                boolean z17 = this.f5349b;
                pd pdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean Q0 = chatActivityEnterView.Q0();
                if (!z17 && (kfVar = chatActivityEnterView.L0) != null) {
                    kfVar.g(!Q0);
                    chatActivityEnterView.L0 = null;
                    return;
                }
                chatActivityEnterView.E4 = !Q0;
                AndroidUtilities.cancelRunOnUIThread(pdVar);
                AndroidUtilities.runOnUIThread(pdVar, 500L);
                return;
            case 5:
                ri riVar = (ri) this.f5350c;
                boolean z18 = this.f5349b;
                org.telegram.ui.ActionBar.o2 o2Var = riVar.f30146f0;
                if (riVar.T0 != 0) {
                    riVar.f30138c2.E();
                    riVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                qq0 qq0Var = new qq0(hashMap, arrayList, 0, true, (sn) o2Var);
                rh rhVar = new rh(riVar, hashMap, arrayList);
                lq0 lq0Var = qq0Var.f40920a;
                lq0Var.f39357s0 = rhVar;
                lq0 lq0Var2 = qq0Var.f40921b;
                lq0Var2.f39357s0 = rhVar;
                lq0Var.f39358t0 = new pq0(qq0Var, 0);
                lq0Var2.f39358t0 = new pq0(qq0Var, 1);
                int i14 = riVar.V1;
                boolean z19 = riVar.W1;
                lq0Var.f0(i14, z19);
                qq0Var.f40921b.f0(i14, z19);
                if (z18) {
                    o2Var.showAsSheet(qq0Var);
                } else {
                    o2Var.presentFragment(qq0Var);
                }
                riVar.dismiss();
                return;
            case 6:
                ch0 ch0Var = (ch0) this.f5350c;
                boolean z20 = this.f5349b;
                ch0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z20 && (!z11 || !LaunchActivity.G1)) {
                    LaunchActivity.H1 = new su(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                av avVar = ch0Var.U;
                if (avVar != null) {
                    avVar.G();
                    return;
                }
                PhotoViewer photoViewer = ch0Var.V;
                if (photoViewer != null && photoViewer.J3) {
                    if (PhotoViewer.f33542a9 != null) {
                        PhotoViewer.f33542a9.H0(false, true);
                    }
                    qt0 qt0Var = photoViewer.f33591f0;
                    if (qt0Var != null && qt0Var.f29272f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                qt0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        qt0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) qt0Var.f29272f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(qt0Var.f29272f);
                        }
                        qt0Var.addView(qt0Var.f29272f, 0, w7.z5.e(-1, -1, 51));
                        ch0.j(false);
                    }
                    PhotoViewer.f33542a9 = PhotoViewer.f33543b9;
                    PhotoViewer.f33543b9 = null;
                    if (photoViewer.f33591f0 == null) {
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
                    if (photoViewer.f33591f0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f33764y2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f33761y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f33591f0 == null) {
                        if (view3 != null) {
                            photoViewer.B3 = true;
                            hl0 o10 = ch0.o(photoViewer.f33764y2.getAspectRatio(), false);
                            float f7 = o10.f27077c / photoViewer.f33755x3.getLayoutParams().width;
                            photoViewer.f33755x3.setScaleX(f7);
                            photoViewer.f33755x3.setScaleY(f7);
                            photoViewer.f33755x3.setTranslationX(o10.f27075a);
                            photoViewer.f33755x3.setTranslationY(o10.f27076b);
                            view3.setScaleX(f7);
                            view3.setScaleY(f7);
                            view3.setTranslationX(o10.f27075a - photoViewer.f33764y2.getX());
                            view3.setTranslationY(o10.f27076b - photoViewer.f33764y2.getY());
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
                            photoViewer.f33755x3.setOutlineProvider(ps0Var);
                            photoViewer.f33755x3.setClipToOutline(true);
                            cu0 cu0Var2 = photoViewer.E2;
                            if (cu0Var2 != null) {
                                cu0Var2.setOutlineProvider(ps0Var);
                                photoViewer.E2.setClipToOutline(true);
                            }
                        } else {
                            ch0.j(true);
                        }
                    } else {
                        photoViewer.f33656m6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f33590f = true;
                        ((WindowManager) photoViewer.f33761y.getSystemService("window")).addView(photoViewer.f33599g0, photoViewer.f33573d0);
                        Activity activity = photoViewer.f33761y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).f33462b1.add(photoViewer.f33706s1);
                        }
                        lu0 lu0Var = photoViewer.f33578d5;
                        if (lu0Var != null && !lu0Var.f39396s) {
                            lu0Var.f39381a.setVisible(false, false);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (photoViewer.D2) {
                        i2.h0 h0Var = photoViewer.F2.d;
                        if (h0Var != null) {
                            h0Var.z1(null);
                        }
                        photoViewer.F2.U(photoViewer.C2);
                        photoViewer.C2.setVisibility(4);
                        photoViewer.G3 = 2;
                        photoViewer.F3 = false;
                        photoViewer.f33582e0.invalidate();
                        photoViewer.f33735v3 = 4;
                        return;
                    }
                    photoViewer.f33735v3 = 4;
                    return;
                }
                return;
            case 7:
                gb0 gb0Var = (gb0) this.f5350c;
                if (!this.f5349b) {
                    org.telegram.ui.Cells.w8 w8Var = gb0Var.f37526n;
                    if (w8Var != null && w8Var.e.h) {
                        int i15 = -gb0Var.N;
                        gb0Var.N = i15;
                        AndroidUtilities.shakeViewSpring(w8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                    boolean z21 = w8Var2.e.h;
                    w8Var2.setChecked(!z21);
                    gb0Var.Z(z21);
                    org.telegram.ui.Cells.w8 w8Var3 = gb0Var.f37526n;
                    if (w8Var3 != null) {
                        if (w8Var2.e.h) {
                            w8Var3.setChecked(false);
                            gb0Var.f37526n.setCheckBoxIcon(R.drawable.permission_locked);
                            gb0Var.f37527r.setVisibility(8);
                            return;
                        } else if (gb0Var.e == null) {
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
                gg0 gg0Var = (gg0) this.f5350c;
                boolean z22 = this.f5349b;
                hg0 hg0Var = gg0Var.f37562a0;
                if (hg0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !hg0Var.E;
                    hg0Var.E = z24;
                    ((org.telegram.ui.Cells.z1) view).c(z24, true);
                    if (((z22 && hg0Var.getConnectionsManager().isTestBackend()) ? false : false) != hg0Var.E) {
                        hg0Var.getConnectionsManager().switchBackend(false);
                    }
                    gg0Var.q();
                    return;
                }
                return;
        }
    }
}
