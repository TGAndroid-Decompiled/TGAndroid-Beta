package lh;

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
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.mh;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dq0;
import org.telegram.ui.ds0;
import org.telegram.ui.eb0;
import org.telegram.ui.eg0;
import org.telegram.ui.eq0;
import org.telegram.ui.et0;
import org.telegram.ui.fg0;
import org.telegram.ui.qt0;
import org.telegram.ui.tn;
import org.telegram.ui.ua1;
import org.telegram.ui.zp0;
import org.telegram.ui.zt0;
public final class z1 implements View.OnClickListener {
    public final int f16447a;
    public final boolean f16448b;
    public final Object f16449c;

    public z1(int i10, Object obj, boolean z10) {
        this.f16447a = i10;
        this.f16449c = obj;
        this.f16448b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z10;
        ff ffVar;
        boolean z11;
        View view2;
        switch (this.f16447a) {
            case 0:
                d4 d4Var = (d4) this.f16449c;
                boolean z12 = this.f16448b;
                MessagesController.getInstance(d4Var.f15545y2).setStoryQuality(!z12);
                tc tcVar = new tc(d4Var.Y0, d4Var.f15539x0);
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
                tcVar.M(string, LocaleController.getString(i11), i12).j();
                w3 w3Var = d4Var.f15510p1;
                if (w3Var != null) {
                    w3Var.a();
                    return;
                }
                return;
            case 1:
                w3 w3Var2 = (w3) this.f16449c;
                boolean z13 = this.f16448b;
                d1 d1Var = d1.S;
                if (d1Var != null) {
                    boolean z14 = !z13;
                    if (d1Var.f15458n && d1Var.f15459r != z14) {
                        d1Var.f15459r = z14;
                        NativeInstance nativeInstance = d1Var.A;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                w3 w3Var3 = w3Var2.f16362l.f15510p1;
                if (w3Var3 != null) {
                    w3Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f16449c;
                boolean z15 = this.f16448b;
                org.telegram.ui.ActionBar.o1 o1Var = w0Var.d;
                if (o1Var != null && o1Var.isShowing() && z15) {
                    if (!w0Var.P) {
                        w0Var.P = true;
                        w0Var.d.d(w0Var.N);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.a0 a0Var = w0Var.f23917c;
                if (a0Var != null) {
                    a0Var.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.s0 s0Var = w0Var.L;
                if (s0Var != null) {
                    s0Var.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                ua1 ua1Var = (ua1) this.f16449c;
                boolean z16 = this.f16448b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) ua1Var.f43211b)[i13];
                    org.telegram.ui.Cells.w0 w0Var2 = x0Var.f25907a;
                    if (x0Var == view) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    w0Var2.a(z10, true);
                }
                SharedConfig.setUseThreeLinesLayout(z16);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f16449c;
                boolean z17 = this.f16448b;
                ld ldVar = chatActivityEnterView.A4;
                chatActivityEnterView.I0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z17 && (ffVar = chatActivityEnterView.H0) != null) {
                    ffVar.h(!S0);
                    chatActivityEnterView.H0 = null;
                    return;
                }
                chatActivityEnterView.f26229z4 = !S0;
                AndroidUtilities.cancelRunOnUIThread(ldVar);
                AndroidUtilities.runOnUIThread(ldVar, 500L);
                return;
            case 5:
                ni niVar = (ni) this.f16449c;
                boolean z18 = this.f16448b;
                org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
                if (niVar.M0 != 0) {
                    niVar.V1.u0();
                    niVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                eq0 eq0Var = new eq0(hashMap, arrayList, 0, true, (tn) o2Var);
                mh mhVar = new mh(niVar, hashMap, arrayList);
                zp0 zp0Var = eq0Var.f37886a;
                zp0Var.f45290o0 = mhVar;
                zp0 zp0Var2 = eq0Var.f37887b;
                zp0Var2.f45290o0 = mhVar;
                zp0Var.f45291p0 = new dq0(eq0Var, 0);
                zp0Var2.f45291p0 = new dq0(eq0Var, 1);
                int i14 = niVar.O1;
                boolean z19 = niVar.P1;
                zp0Var.f0(i14, z19);
                eq0Var.f37887b.f0(i14, z19);
                if (z18) {
                    o2Var.showAsSheet(eq0Var);
                } else {
                    o2Var.presentFragment(eq0Var);
                }
                niVar.dismiss();
                return;
            case 6:
                bg0 bg0Var = (bg0) this.f16449c;
                boolean z20 = this.f16448b;
                bg0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z20 && (!z11 || !LaunchActivity.A1)) {
                    LaunchActivity.B1 = new eu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                mu muVar = bg0Var.Q;
                if (muVar != null) {
                    muVar.H();
                    return;
                }
                PhotoViewer photoViewer = bg0Var.R;
                if (photoViewer != null && photoViewer.F3) {
                    if (PhotoViewer.V8 != null) {
                        PhotoViewer.V8.G0(false, true);
                    }
                    et0 et0Var = photoViewer.f35656b0;
                    if (et0Var != null && et0Var.f30675f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                et0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        et0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) et0Var.f30675f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(et0Var.f30675f);
                        }
                        et0Var.addView(et0Var.f30675f, 0, i7.f6.e(-1, -1, 51));
                        bg0.j(false);
                    }
                    PhotoViewer.V8 = PhotoViewer.W8;
                    PhotoViewer.W8 = null;
                    if (photoViewer.f35656b0 == null) {
                        photoViewer.H3 = true;
                        Bitmap bitmap = photoViewer.f35868y3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.f35868y3 = null;
                        }
                        photoViewer.B3 = true;
                    }
                    photoViewer.F3 = false;
                    if (photoViewer.f35875z2) {
                        view2 = photoViewer.f35867y2;
                    } else {
                        view2 = photoViewer.f35858x2;
                    }
                    View view3 = view2;
                    if (photoViewer.f35656b0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f35829u2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f35864y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f35656b0 == null) {
                        if (view3 != null) {
                            photoViewer.f35859x3 = true;
                            hk0 o10 = bg0.o(photoViewer.f35829u2.getAspectRatio(), false);
                            float f9 = o10.f29197c / photoViewer.f35821t3.getLayoutParams().width;
                            photoViewer.f35821t3.setScaleX(f9);
                            photoViewer.f35821t3.setScaleY(f9);
                            photoViewer.f35821t3.setTranslationX(o10.f29195a);
                            photoViewer.f35821t3.setTranslationY(o10.f29196b);
                            view3.setScaleX(f9);
                            view3.setScaleY(f9);
                            view3.setTranslationX(o10.f29195a - photoViewer.f35829u2.getX());
                            view3.setTranslationY(o10.f29196b - photoViewer.f35829u2.getY());
                            qt0 qt0Var = photoViewer.A2;
                            if (qt0Var != null) {
                                qt0Var.setScaleX(f9);
                                photoViewer.A2.setScaleY(f9);
                                photoViewer.A2.setTranslationX(view3.getTranslationX());
                                photoViewer.A2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.S = 0.0f;
                            ds0 ds0Var = new ds0(photoViewer, f9, 1);
                            view3.setOutlineProvider(ds0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f35821t3.setOutlineProvider(ds0Var);
                            photoViewer.f35821t3.setClipToOutline(true);
                            qt0 qt0Var2 = photoViewer.A2;
                            if (qt0Var2 != null) {
                                qt0Var2.setOutlineProvider(ds0Var);
                                photoViewer.A2.setClipToOutline(true);
                            }
                        } else {
                            bg0.j(true);
                        }
                    } else {
                        photoViewer.f35726i6 = 0.0f;
                    }
                    try {
                        photoViewer.f35682e = true;
                        photoViewer.f35692f = true;
                        ((WindowManager) photoViewer.f35864y.getSystemService("window")).addView(photoViewer.f35666c0, photoViewer.Z);
                        Activity activity = photoViewer.f35864y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).W0.add(photoViewer.f35774o1);
                        }
                        zt0 zt0Var = photoViewer.Z4;
                        if (zt0Var != null && !zt0Var.f45332s) {
                            zt0Var.f45316a.setVisible(false, false);
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (photoViewer.f35875z2) {
                        j3.k0 k0Var = photoViewer.B2.d;
                        if (k0Var != null) {
                            k0Var.j0(null);
                        }
                        photoViewer.B2.V(photoViewer.f35867y2);
                        photoViewer.f35867y2.setVisibility(4);
                        photoViewer.C3 = 2;
                        photoViewer.B3 = false;
                        photoViewer.f35647a0.invalidate();
                        photoViewer.f35803r3 = 4;
                        return;
                    }
                    photoViewer.f35803r3 = 4;
                    return;
                }
                return;
            case 7:
                eb0 eb0Var = (eb0) this.f16449c;
                if (!this.f16448b) {
                    org.telegram.ui.Cells.q8 q8Var = eb0Var.f37779n;
                    if (q8Var != null && q8Var.f25083e.h) {
                        int i15 = -eb0Var.J;
                        eb0Var.J = i15;
                        AndroidUtilities.shakeViewSpring(q8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                    boolean z21 = q8Var2.f25083e.h;
                    q8Var2.setChecked(!z21);
                    eb0Var.Z(z21);
                    org.telegram.ui.Cells.q8 q8Var3 = eb0Var.f37779n;
                    if (q8Var3 != null) {
                        if (q8Var2.f25083e.h) {
                            q8Var3.setChecked(false);
                            eb0Var.f37779n.setCheckBoxIcon(R.drawable.permission_locked);
                            eb0Var.f37780r.setVisibility(8);
                            return;
                        } else if (eb0Var.f37777e == null) {
                            q8Var3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                eg0 eg0Var = (eg0) this.f16449c;
                boolean z22 = this.f16448b;
                fg0 fg0Var = eg0Var.R;
                if (fg0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !fg0Var.A;
                    fg0Var.A = z24;
                    ((org.telegram.ui.Cells.y1) view).c(z24, true);
                    if (((z22 && fg0Var.getConnectionsManager().isTestBackend()) ? false : false) != fg0Var.A) {
                        fg0Var.getConnectionsManager().switchBackend(false);
                    }
                    eg0Var.s();
                    return;
                }
                return;
        }
    }
}
