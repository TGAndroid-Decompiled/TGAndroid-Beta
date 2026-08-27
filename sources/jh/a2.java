package jh;

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
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.fh;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.ye;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.aq0;
import org.telegram.ui.cu0;
import org.telegram.ui.eq0;
import org.telegram.ui.fb0;
import org.telegram.ui.fq0;
import org.telegram.ui.fs0;
import org.telegram.ui.hg0;
import org.telegram.ui.ht0;
import org.telegram.ui.ig0;
import org.telegram.ui.ra1;
import org.telegram.ui.rn;
import org.telegram.ui.tt0;

public final class a2 implements View.OnClickListener {

    public final int f13027a;

    public final boolean f13028b;

    public final Object f13029c;

    public a2(int i10, Object obj, boolean z10) {
        this.f13027a = i10;
        this.f13029c = obj;
        this.f13028b = z10;
    }

    @Override
    public final void onClick(View view) {
        ye yeVar;
        switch (this.f13027a) {
            case 0:
                e4 e4Var = (e4) this.f13029c;
                boolean z10 = this.f13028b;
                MessagesController.getInstance(e4Var.f13296y2).setStoryQuality(!z10);
                new mc(e4Var.Y0, e4Var.f13290x0).M(LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage), R.raw.chats_infotip).j();
                x3 x3Var = e4Var.f13261p1;
                if (x3Var != null) {
                    x3Var.a();
                }
                break;
            case 1:
                x3 x3Var2 = (x3) this.f13029c;
                boolean z11 = this.f13028b;
                d1 d1Var = d1.S;
                if (d1Var != null) {
                    boolean z12 = !z11;
                    if (d1Var.f13179n && d1Var.f13180r != z12) {
                        d1Var.f13180r = z12;
                        NativeInstance nativeInstance = d1Var.A;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                }
                x3 x3Var3 = x3Var2.f14128l.f13261p1;
                if (x3Var3 != null) {
                    x3Var3.a();
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f13029c;
                boolean z13 = this.f13028b;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
                if (n1Var != null && n1Var.isShowing() && z13) {
                    if (!v0Var.P) {
                        v0Var.P = true;
                        v0Var.d.d(v0Var.N);
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var.f23856c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                } else {
                    org.telegram.ui.ActionBar.r0 r0Var = v0Var.L;
                    if (r0Var != null) {
                        r0Var.h(((Integer) view.getTag()).intValue());
                    }
                }
                break;
            case 3:
                ra1 ra1Var = (ra1) this.f13029c;
                boolean z14 = this.f13028b;
                for (int i10 = 0; i10 < 2; i10++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) ra1Var.f41887b)[i10];
                    x0Var.f25919a.a(x0Var == view, true);
                }
                SharedConfig.setUseThreeLinesLayout(z14);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f13029c;
                boolean z15 = this.f13028b;
                ed edVar = chatActivityEnterView.A4;
                chatActivityEnterView.I0 = System.currentTimeMillis();
                boolean zS0 = chatActivityEnterView.S0();
                if (z15 || (yeVar = chatActivityEnterView.H0) == null) {
                    chatActivityEnterView.f26214z4 = !zS0;
                    AndroidUtilities.cancelRunOnUIThread(edVar);
                    AndroidUtilities.runOnUIThread(edVar, 500L);
                } else {
                    yeVar.h(!zS0);
                    chatActivityEnterView.H0 = null;
                }
                break;
            case 5:
                gi giVar = (gi) this.f13029c;
                boolean z16 = this.f13028b;
                org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
                if (giVar.M0 != 0) {
                    giVar.V1.w();
                    giVar.dismiss();
                } else {
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    fq0 fq0Var = new fq0(map, arrayList, 0, true, (rn) n2Var);
                    fh fhVar = new fh(giVar, map, arrayList);
                    aq0 aq0Var = fq0Var.f38185a;
                    aq0Var.f36615o0 = fhVar;
                    aq0 aq0Var2 = fq0Var.f38186b;
                    aq0Var2.f36615o0 = fhVar;
                    aq0Var.f36616p0 = new eq0(fq0Var, 0);
                    aq0Var2.f36616p0 = new eq0(fq0Var, 1);
                    int i11 = giVar.O1;
                    boolean z17 = giVar.P1;
                    aq0Var.f0(i11, z17);
                    fq0Var.f38186b.f0(i11, z17);
                    if (z16) {
                        n2Var.showAsSheet(fq0Var);
                    } else {
                        n2Var.presentFragment(fq0Var);
                    }
                    giVar.dismiss();
                }
                break;
            case 6:
                sf0 sf0Var = (sf0) this.f13029c;
                boolean z18 = this.f13028b;
                sf0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z19 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z18 && (!z19 || !LaunchActivity.A1)) {
                    LaunchActivity.B1 = new xt(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    break;
                } else {
                    fu fuVar = sf0Var.Q;
                    if (fuVar != null) {
                        fuVar.I();
                        break;
                    } else {
                        PhotoViewer photoViewer = sf0Var.R;
                        if (photoViewer != null && photoViewer.F3) {
                            if (PhotoViewer.V8 != null) {
                                PhotoViewer.V8.G0(false, true);
                            }
                            ht0 ht0Var = photoViewer.f35591b0;
                            if (ht0Var != null && ht0Var.f27741f != null) {
                                if (ApplicationLoader.mainInterfacePaused) {
                                    try {
                                        ht0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th) {
                                        FileLog.e(th);
                                    }
                                }
                                ht0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) ht0Var.f27741f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(ht0Var.f27741f);
                                }
                                ht0Var.addView(ht0Var.f27741f, 0, h7.z5.e(-1, -1, 51));
                                sf0.j(false);
                            }
                            PhotoViewer.V8 = PhotoViewer.W8;
                            PhotoViewer.W8 = null;
                            if (photoViewer.f35591b0 == null) {
                                photoViewer.H3 = true;
                                Bitmap bitmap = photoViewer.f35804y3;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    photoViewer.f35804y3 = null;
                                }
                                photoViewer.B3 = true;
                            }
                            photoViewer.F3 = false;
                            View view2 = photoViewer.f35812z2 ? photoViewer.f35803y2 : photoViewer.f35794x2;
                            if (photoViewer.f35591b0 == null && view2 != null) {
                                AndroidUtilities.removeFromParent(view2);
                                view2.setVisibility(4);
                                photoViewer.f35766u2.addView(view2);
                            }
                            if (ApplicationLoader.mainInterfacePaused) {
                                try {
                                    photoViewer.f35800y.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                } catch (Throwable th2) {
                                    FileLog.e(th2);
                                }
                            }
                            if (photoViewer.f35591b0 != null) {
                                photoViewer.f35663i6 = 0.0f;
                            } else if (view2 != null) {
                                photoViewer.f35795x3 = true;
                                yj0 yj0VarO = sf0.o(photoViewer.f35766u2.getAspectRatio(), false);
                                float f10 = yj0VarO.f34913c / photoViewer.f35758t3.getLayoutParams().width;
                                photoViewer.f35758t3.setScaleX(f10);
                                photoViewer.f35758t3.setScaleY(f10);
                                photoViewer.f35758t3.setTranslationX(yj0VarO.f34911a);
                                photoViewer.f35758t3.setTranslationY(yj0VarO.f34912b);
                                view2.setScaleX(f10);
                                view2.setScaleY(f10);
                                view2.setTranslationX(yj0VarO.f34911a - photoViewer.f35766u2.getX());
                                view2.setTranslationY(yj0VarO.f34912b - photoViewer.f35766u2.getY());
                                tt0 tt0Var = photoViewer.A2;
                                if (tt0Var != null) {
                                    tt0Var.setScaleX(f10);
                                    photoViewer.A2.setScaleY(f10);
                                    photoViewer.A2.setTranslationX(view2.getTranslationX());
                                    photoViewer.A2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.S = 0.0f;
                                fs0 fs0Var = new fs0(photoViewer, f10, 1);
                                view2.setOutlineProvider(fs0Var);
                                view2.setClipToOutline(true);
                                photoViewer.f35758t3.setOutlineProvider(fs0Var);
                                photoViewer.f35758t3.setClipToOutline(true);
                                tt0 tt0Var2 = photoViewer.A2;
                                if (tt0Var2 != null) {
                                    tt0Var2.setOutlineProvider(fs0Var);
                                    photoViewer.A2.setClipToOutline(true);
                                }
                            } else {
                                sf0.j(true);
                            }
                            try {
                                photoViewer.f35619e = true;
                                photoViewer.f35629f = true;
                                ((WindowManager) photoViewer.f35800y.getSystemService("window")).addView(photoViewer.f35601c0, photoViewer.Z);
                                Activity activity = photoViewer.f35800y;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).W0.add(photoViewer.f35711o1);
                                }
                                cu0 cu0Var = photoViewer.Z4;
                                if (cu0Var != null && !cu0Var.f37169s) {
                                    cu0Var.f37153a.setVisible(false, false);
                                }
                            } catch (Exception e9) {
                                FileLog.e(e9);
                            }
                            if (photoViewer.f35812z2) {
                                h3.k0 k0Var = photoViewer.B2.d;
                                if (k0Var != null) {
                                    k0Var.j0(null);
                                }
                                photoViewer.B2.V(photoViewer.f35803y2);
                                photoViewer.f35803y2.setVisibility(4);
                                photoViewer.C3 = 2;
                                photoViewer.B3 = false;
                                photoViewer.f35583a0.invalidate();
                                photoViewer.f35739r3 = 4;
                            } else {
                                photoViewer.f35739r3 = 4;
                            }
                            break;
                        }
                    }
                }
                break;
            case 7:
                fb0 fb0Var = (fb0) this.f13029c;
                if (!this.f13028b) {
                    org.telegram.ui.Cells.p8 p8Var = fb0Var.f38059n;
                    if (p8Var == null || !p8Var.f25003e.h) {
                        org.telegram.ui.Cells.p8 p8Var2 = (org.telegram.ui.Cells.p8) view;
                        boolean z20 = p8Var2.f25003e.h;
                        p8Var2.setChecked(!z20);
                        fb0Var.Z(z20);
                        org.telegram.ui.Cells.p8 p8Var3 = fb0Var.f38059n;
                        if (p8Var3 != null) {
                            if (p8Var2.f25003e.h) {
                                p8Var3.setChecked(false);
                                fb0Var.f38059n.setCheckBoxIcon(R.drawable.permission_locked);
                                fb0Var.f38060r.setVisibility(8);
                            } else if (fb0Var.f38057e == null) {
                                p8Var3.setCheckBoxIcon(0);
                            }
                        }
                    } else {
                        int i12 = -fb0Var.J;
                        fb0Var.J = i12;
                        AndroidUtilities.shakeViewSpring(p8Var, i12);
                    }
                    break;
                }
                break;
            default:
                hg0 hg0Var = (hg0) this.f13029c;
                boolean z21 = this.f13028b;
                ig0 ig0Var = hg0Var.R;
                if (ig0Var.getParentActivity() != null) {
                    boolean z22 = !ig0Var.A;
                    ig0Var.A = z22;
                    ((org.telegram.ui.Cells.y1) view).c(z22, true);
                    if ((z21 && ig0Var.getConnectionsManager().isTestBackend()) != ig0Var.A) {
                        ig0Var.getConnectionsManager().switchBackend(false);
                    }
                    hg0Var.s();
                    break;
                }
                break;
        }
    }
}
