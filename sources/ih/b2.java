package ih;

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
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.yt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bb0;
import org.telegram.ui.bu0;
import org.telegram.ui.dq0;
import org.telegram.ui.eg0;
import org.telegram.ui.eq0;
import org.telegram.ui.es0;
import org.telegram.ui.fg0;
import org.telegram.ui.gt0;
import org.telegram.ui.qn;
import org.telegram.ui.st0;
import org.telegram.ui.ta1;
import org.telegram.ui.zp0;
public final class b2 implements View.OnClickListener {
    public final int f11255a;
    public final boolean f11256b;
    public final Object f11257c;

    public b2(int i9, Object obj, boolean z10) {
        this.f11255a = i9;
        this.f11257c = obj;
        this.f11256b = z10;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        int i10;
        boolean z10;
        cf cfVar;
        boolean z11;
        View view2;
        switch (this.f11255a) {
            case 0:
                i4 i4Var = (i4) this.f11257c;
                boolean z12 = this.f11256b;
                MessagesController.getInstance(i4Var.f11609y2).setStoryQuality(!z12);
                oc ocVar = new oc(i4Var.Y0, i4Var.f11603x0);
                int i11 = R.raw.chats_infotip;
                if (!z12) {
                    i9 = R.string.StoryQualityIncreasedTitle;
                } else {
                    i9 = R.string.StoryQualityDecreasedTitle;
                }
                String string = LocaleController.getString(i9);
                if (!z12) {
                    i10 = R.string.StoryQualityIncreasedMessage;
                } else {
                    i10 = R.string.StoryQualityDecreasedMessage;
                }
                ocVar.M(string, LocaleController.getString(i10), i11).j();
                b4 b4Var = i4Var.f11574p1;
                if (b4Var != null) {
                    b4Var.a();
                    return;
                }
                return;
            case 1:
                b4 b4Var2 = (b4) this.f11257c;
                boolean z13 = this.f11256b;
                f1 f1Var = f1.S;
                if (f1Var != null) {
                    boolean z14 = !z13;
                    if (f1Var.f11403n && f1Var.f11404r != z14) {
                        f1Var.f11404r = z14;
                        NativeInstance nativeInstance = f1Var.A;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z14);
                        }
                    }
                }
                b4 b4Var3 = b4Var2.f11268l.f11574p1;
                if (b4Var3 != null) {
                    b4Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f11257c;
                boolean z15 = this.f11256b;
                org.telegram.ui.ActionBar.o1 o1Var = w0Var.d;
                if (o1Var != null && o1Var.isShowing() && z15) {
                    if (!w0Var.P) {
                        w0Var.P = true;
                        w0Var.d.d(w0Var.N);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = w0Var.f23903c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.s0 s0Var = w0Var.L;
                if (s0Var != null) {
                    s0Var.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                ta1 ta1Var = (ta1) this.f11257c;
                boolean z16 = this.f11256b;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) ta1Var.f42939b)[i12];
                    org.telegram.ui.Cells.x0 x0Var = y0Var.f25976a;
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
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f11257c;
                boolean z17 = this.f11256b;
                hd hdVar = chatActivityEnterView.A4;
                chatActivityEnterView.I0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z17 && (cfVar = chatActivityEnterView.H0) != null) {
                    cfVar.h(!S0);
                    chatActivityEnterView.H0 = null;
                    return;
                }
                chatActivityEnterView.f26218z4 = !S0;
                AndroidUtilities.cancelRunOnUIThread(hdVar);
                AndroidUtilities.runOnUIThread(hdVar, 500L);
                return;
            case 5:
                ki kiVar = (ki) this.f11257c;
                boolean z18 = this.f11256b;
                org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
                if (kiVar.M0 != 0) {
                    kiVar.V1.o();
                    kiVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                eq0 eq0Var = new eq0(hashMap, arrayList, 0, true, (qn) o2Var);
                jh jhVar = new jh(kiVar, hashMap, arrayList);
                zp0 zp0Var = eq0Var.f38008a;
                zp0Var.f45225o0 = jhVar;
                zp0 zp0Var2 = eq0Var.f38009b;
                zp0Var2.f45225o0 = jhVar;
                zp0Var.f45226p0 = new dq0(eq0Var, 0);
                zp0Var2.f45226p0 = new dq0(eq0Var, 1);
                int i13 = kiVar.O1;
                boolean z19 = kiVar.P1;
                zp0Var.e0(i13, z19);
                eq0Var.f38009b.e0(i13, z19);
                if (z18) {
                    o2Var.showAsSheet(eq0Var);
                } else {
                    o2Var.presentFragment(eq0Var);
                }
                kiVar.dismiss();
                return;
            case 6:
                pf0 pf0Var = (pf0) this.f11257c;
                boolean z20 = this.f11256b;
                pf0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z20 && (!z11 || !LaunchActivity.A1)) {
                    LaunchActivity.B1 = new yt(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                gu guVar = pf0Var.Q;
                if (guVar != null) {
                    guVar.H();
                    return;
                }
                PhotoViewer photoViewer = pf0Var.R;
                if (photoViewer != null && photoViewer.F3) {
                    if (PhotoViewer.V8 != null) {
                        PhotoViewer.V8.F0(false, true);
                    }
                    gt0 gt0Var = photoViewer.f35588b0;
                    if (gt0Var != null && gt0Var.f35290f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                gt0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th) {
                                FileLog.e(th);
                            }
                        }
                        gt0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) gt0Var.f35290f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(gt0Var.f35290f);
                        }
                        gt0Var.addView(gt0Var.f35290f, 0, g7.e6.e(-1, -1, 51));
                        pf0.j(false);
                    }
                    PhotoViewer.V8 = PhotoViewer.W8;
                    PhotoViewer.W8 = null;
                    if (photoViewer.f35588b0 == null) {
                        photoViewer.H3 = true;
                        Bitmap bitmap = photoViewer.f35801y3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.f35801y3 = null;
                        }
                        photoViewer.B3 = true;
                    }
                    photoViewer.F3 = false;
                    if (photoViewer.f35809z2) {
                        view2 = photoViewer.f35800y2;
                    } else {
                        view2 = photoViewer.f35790x2;
                    }
                    View view3 = view2;
                    if (photoViewer.f35588b0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f35763u2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f35797y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                        }
                    }
                    if (photoViewer.f35588b0 == null) {
                        if (view3 != null) {
                            photoViewer.f35791x3 = true;
                            wj0 o6 = pf0.o(photoViewer.f35763u2.getAspectRatio(), false);
                            float f10 = o6.f34235c / photoViewer.f35755t3.getLayoutParams().width;
                            photoViewer.f35755t3.setScaleX(f10);
                            photoViewer.f35755t3.setScaleY(f10);
                            photoViewer.f35755t3.setTranslationX(o6.f34233a);
                            photoViewer.f35755t3.setTranslationY(o6.f34234b);
                            view3.setScaleX(f10);
                            view3.setScaleY(f10);
                            view3.setTranslationX(o6.f34233a - photoViewer.f35763u2.getX());
                            view3.setTranslationY(o6.f34234b - photoViewer.f35763u2.getY());
                            st0 st0Var = photoViewer.A2;
                            if (st0Var != null) {
                                st0Var.setScaleX(f10);
                                photoViewer.A2.setScaleY(f10);
                                photoViewer.A2.setTranslationX(view3.getTranslationX());
                                photoViewer.A2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.S = 0.0f;
                            es0 es0Var = new es0(photoViewer, f10, 1);
                            view3.setOutlineProvider(es0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f35755t3.setOutlineProvider(es0Var);
                            photoViewer.f35755t3.setClipToOutline(true);
                            st0 st0Var2 = photoViewer.A2;
                            if (st0Var2 != null) {
                                st0Var2.setOutlineProvider(es0Var);
                                photoViewer.A2.setClipToOutline(true);
                            }
                        } else {
                            pf0.j(true);
                        }
                    } else {
                        photoViewer.f35660i6 = 0.0f;
                    }
                    try {
                        photoViewer.f35616e = true;
                        photoViewer.f35626f = true;
                        ((WindowManager) photoViewer.f35797y.getSystemService("window")).addView(photoViewer.f35598c0, photoViewer.Z);
                        Activity activity = photoViewer.f35797y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).W0.add(photoViewer.f35708o1);
                        }
                        bu0 bu0Var = photoViewer.Z4;
                        if (bu0Var != null && !bu0Var.f36994s) {
                            bu0Var.f36978a.setVisible(false, false);
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (photoViewer.f35809z2) {
                        h3.k0 k0Var = photoViewer.B2.d;
                        if (k0Var != null) {
                            k0Var.j0(null);
                        }
                        photoViewer.B2.V(photoViewer.f35800y2);
                        photoViewer.f35800y2.setVisibility(4);
                        photoViewer.C3 = 2;
                        photoViewer.B3 = false;
                        photoViewer.f35580a0.invalidate();
                        photoViewer.f35736r3 = 4;
                        return;
                    }
                    photoViewer.f35736r3 = 4;
                    return;
                }
                return;
            case 7:
                bb0 bb0Var = (bb0) this.f11257c;
                if (!this.f11256b) {
                    org.telegram.ui.Cells.t8 t8Var = bb0Var.f36813n;
                    if (t8Var != null && t8Var.f25711e.h) {
                        int i14 = -bb0Var.J;
                        bb0Var.J = i14;
                        AndroidUtilities.shakeViewSpring(t8Var, i14);
                        return;
                    }
                    org.telegram.ui.Cells.t8 t8Var2 = (org.telegram.ui.Cells.t8) view;
                    boolean z21 = t8Var2.f25711e.h;
                    t8Var2.setChecked(!z21);
                    bb0Var.Y(z21);
                    org.telegram.ui.Cells.t8 t8Var3 = bb0Var.f36813n;
                    if (t8Var3 != null) {
                        if (t8Var2.f25711e.h) {
                            t8Var3.setChecked(false);
                            bb0Var.f36813n.setCheckBoxIcon(R.drawable.permission_locked);
                            bb0Var.f36814r.setVisibility(8);
                            return;
                        } else if (bb0Var.f36811e == null) {
                            t8Var3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                eg0 eg0Var = (eg0) this.f11257c;
                boolean z22 = this.f11256b;
                fg0 fg0Var = eg0Var.R;
                if (fg0Var.getParentActivity() != null) {
                    boolean z23 = true;
                    boolean z24 = !fg0Var.A;
                    fg0Var.A = z24;
                    ((org.telegram.ui.Cells.z1) view).c(z24, true);
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
