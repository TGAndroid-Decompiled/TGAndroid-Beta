package nh;

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
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hu0;
import org.telegram.ui.mq0;
import org.telegram.ui.og0;
import org.telegram.ui.pb0;
import org.telegram.ui.pb1;
import org.telegram.ui.pg0;
import org.telegram.ui.qq0;
import org.telegram.ui.qu0;
import org.telegram.ui.rq0;
import org.telegram.ui.ts0;
import org.telegram.ui.ut0;
import org.telegram.ui.zn;
public final class a2 implements View.OnClickListener {
    public final int f15026a;
    public final boolean f15027b;
    public final Object f15028c;

    public a2(int i10, Object obj, boolean z4) {
        this.f15026a = i10;
        this.f15028c = obj;
        this.f15027b = z4;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        boolean z4;
        cf cfVar;
        boolean z10;
        View view2;
        switch (this.f15026a) {
            case 0:
                d4 d4Var = (d4) this.f15028c;
                boolean z11 = this.f15027b;
                MessagesController.getInstance(d4Var.f15243z2).setStoryQuality(!z11);
                qc qcVar = new qc(d4Var.Z0, d4Var.f15237y0);
                int i12 = R.raw.chats_infotip;
                if (!z11) {
                    i10 = R.string.StoryQualityIncreasedTitle;
                } else {
                    i10 = R.string.StoryQualityDecreasedTitle;
                }
                String string = LocaleController.getString(i10);
                if (!z11) {
                    i11 = R.string.StoryQualityIncreasedMessage;
                } else {
                    i11 = R.string.StoryQualityDecreasedMessage;
                }
                qcVar.M(string, LocaleController.getString(i11), i12).j();
                w3 w3Var = d4Var.f15208q1;
                if (w3Var != null) {
                    w3Var.a();
                    return;
                }
                return;
            case 1:
                w3 w3Var2 = (w3) this.f15028c;
                boolean z12 = this.f15027b;
                e1 e1Var = e1.T;
                if (e1Var != null) {
                    boolean z13 = !z12;
                    if (e1Var.f15276n && e1Var.f15277r != z13) {
                        e1Var.f15277r = z13;
                        NativeInstance nativeInstance = e1Var.B;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z13);
                        }
                    }
                }
                w3 w3Var3 = w3Var2.f16007l.f15208q1;
                if (w3Var3 != null) {
                    w3Var3.a();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.f15028c;
                boolean z14 = this.f15027b;
                org.telegram.ui.ActionBar.p1 p1Var = w0Var.d;
                if (p1Var != null && p1Var.isShowing() && z14) {
                    if (!w0Var.Q) {
                        w0Var.Q = true;
                        w0Var.d.d(w0Var.O);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = w0Var.f20626c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.s0 s0Var = w0Var.M;
                if (s0Var != null) {
                    s0Var.m(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 3:
                pb1 pb1Var = (pb1) this.f15028c;
                boolean z15 = this.f15027b;
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) pb1Var.f37071b)[i13];
                    org.telegram.ui.Cells.w0 w0Var2 = x0Var.f22533a;
                    if (x0Var == view) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    w0Var2.a(z4, true);
                }
                SharedConfig.setUseThreeLinesLayout(z15);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f15028c;
                boolean z16 = this.f15027b;
                id idVar = chatActivityEnterView.B4;
                chatActivityEnterView.J0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z16 && (cfVar = chatActivityEnterView.I0) != null) {
                    cfVar.h(!S0);
                    chatActivityEnterView.I0 = null;
                    return;
                }
                chatActivityEnterView.A4 = !S0;
                AndroidUtilities.cancelRunOnUIThread(idVar);
                AndroidUtilities.runOnUIThread(idVar, 500L);
                return;
            case 5:
                li liVar = (li) this.f15028c;
                boolean z17 = this.f15027b;
                org.telegram.ui.ActionBar.p2 p2Var = liVar.f26685c0;
                if (liVar.N0 != 0) {
                    liVar.W1.z0();
                    liVar.dismiss();
                    return;
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                rq0 rq0Var = new rq0(hashMap, arrayList, 0, true, (zn) p2Var);
                jh jhVar = new jh(liVar, hashMap, arrayList);
                mq0 mq0Var = rq0Var.f37946a;
                mq0Var.f36180p0 = jhVar;
                mq0 mq0Var2 = rq0Var.f37947b;
                mq0Var2.f36180p0 = jhVar;
                mq0Var.f36181q0 = new qq0(rq0Var, 0);
                mq0Var2.f36181q0 = new qq0(rq0Var, 1);
                int i14 = liVar.P1;
                boolean z18 = liVar.Q1;
                mq0Var.f0(i14, z18);
                rq0Var.f37947b.f0(i14, z18);
                if (z17) {
                    p2Var.showAsSheet(rq0Var);
                } else {
                    p2Var.presentFragment(rq0Var);
                }
                liVar.dismiss();
                return;
            case 6:
                mg0 mg0Var = (mg0) this.f15028c;
                boolean z19 = this.f15027b;
                mg0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty() && runningAppProcesses.get(0).importance != 100) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z19 && (!z10 || !LaunchActivity.B1)) {
                    LaunchActivity.C1 = new gu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, LaunchActivity.class);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                    return;
                }
                ou ouVar = mg0Var.R;
                if (ouVar != null) {
                    ouVar.H();
                    return;
                }
                PhotoViewer photoViewer = mg0Var.S;
                if (photoViewer != null && photoViewer.G3) {
                    if (PhotoViewer.W8 != null) {
                        PhotoViewer.W8.G0(false, true);
                    }
                    ut0 ut0Var = photoViewer.f31689c0;
                    if (ut0Var != null && ut0Var.f30240f != null) {
                        if (ApplicationLoader.mainInterfacePaused) {
                            try {
                                ut0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        ut0Var.h.setVisibility(0);
                        ViewGroup viewGroup = (ViewGroup) ut0Var.f30240f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(ut0Var.f30240f);
                        }
                        ut0Var.addView(ut0Var.f30240f, 0, k7.b6.e(-1, -1, 51));
                        mg0.j(false);
                    }
                    PhotoViewer.W8 = PhotoViewer.X8;
                    PhotoViewer.X8 = null;
                    if (photoViewer.f31689c0 == null) {
                        photoViewer.I3 = true;
                        Bitmap bitmap = photoViewer.f31900z3;
                        if (bitmap != null) {
                            bitmap.recycle();
                            photoViewer.f31900z3 = null;
                        }
                        photoViewer.C3 = true;
                    }
                    photoViewer.G3 = false;
                    if (photoViewer.A2) {
                        view2 = photoViewer.f31899z2;
                    } else {
                        view2 = photoViewer.f31890y2;
                    }
                    View view3 = view2;
                    if (photoViewer.f31689c0 == null && view3 != null) {
                        AndroidUtilities.removeFromParent(view3);
                        view3.setVisibility(4);
                        photoViewer.f31860v2.addView(view3);
                    }
                    if (ApplicationLoader.mainInterfacePaused) {
                        try {
                            photoViewer.f31887y.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                        } catch (Throwable th3) {
                            FileLog.e(th3);
                        }
                    }
                    if (photoViewer.f31689c0 == null) {
                        if (view3 != null) {
                            photoViewer.f31891y3 = true;
                            rk0 o10 = mg0.o(photoViewer.f31860v2.getAspectRatio(), false);
                            float f10 = o10.f28485c / photoViewer.f31852u3.getLayoutParams().width;
                            photoViewer.f31852u3.setScaleX(f10);
                            photoViewer.f31852u3.setScaleY(f10);
                            photoViewer.f31852u3.setTranslationX(o10.f28483a);
                            photoViewer.f31852u3.setTranslationY(o10.f28484b);
                            view3.setScaleX(f10);
                            view3.setScaleY(f10);
                            view3.setTranslationX(o10.f28483a - photoViewer.f31860v2.getX());
                            view3.setTranslationY(o10.f28484b - photoViewer.f31860v2.getY());
                            hu0 hu0Var = photoViewer.B2;
                            if (hu0Var != null) {
                                hu0Var.setScaleX(f10);
                                photoViewer.B2.setScaleY(f10);
                                photoViewer.B2.setTranslationX(view3.getTranslationX());
                                photoViewer.B2.setTranslationY(view3.getTranslationY());
                            }
                            photoViewer.T = 0.0f;
                            ts0 ts0Var = new ts0(photoViewer, f10, 1);
                            view3.setOutlineProvider(ts0Var);
                            view3.setClipToOutline(true);
                            photoViewer.f31852u3.setOutlineProvider(ts0Var);
                            photoViewer.f31852u3.setClipToOutline(true);
                            hu0 hu0Var2 = photoViewer.B2;
                            if (hu0Var2 != null) {
                                hu0Var2.setOutlineProvider(ts0Var);
                                photoViewer.B2.setClipToOutline(true);
                            }
                        } else {
                            mg0.j(true);
                        }
                    } else {
                        photoViewer.f31757j6 = 0.0f;
                    }
                    try {
                        photoViewer.e = true;
                        photoViewer.f31714f = true;
                        ((WindowManager) photoViewer.f31887y.getSystemService("window")).addView(photoViewer.f31697d0, photoViewer.f31670a0);
                        Activity activity = photoViewer.f31887y;
                        if (activity instanceof LaunchActivity) {
                            ((LaunchActivity) activity).X0.add(photoViewer.f31805p1);
                        }
                        qu0 qu0Var = photoViewer.f31674a5;
                        if (qu0Var != null && !qu0Var.f37502s) {
                            qu0Var.f37487a.setVisible(false, false);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (photoViewer.A2) {
                        j3.f0 f0Var = photoViewer.C2.d;
                        if (f0Var != null) {
                            f0Var.c0(null);
                        }
                        photoViewer.C2.U(photoViewer.f31899z2);
                        photoViewer.f31899z2.setVisibility(4);
                        photoViewer.D3 = 2;
                        photoViewer.C3 = false;
                        photoViewer.f31679b0.invalidate();
                        photoViewer.f31836s3 = 4;
                        return;
                    }
                    photoViewer.f31836s3 = 4;
                    return;
                }
                return;
            case 7:
                pb0 pb0Var = (pb0) this.f15028c;
                if (!this.f15027b) {
                    org.telegram.ui.Cells.r8 r8Var = pb0Var.f37064n;
                    if (r8Var != null && r8Var.e.h) {
                        int i15 = -pb0Var.K;
                        pb0Var.K = i15;
                        AndroidUtilities.shakeViewSpring(r8Var, i15);
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                    boolean z20 = r8Var2.e.h;
                    r8Var2.setChecked(!z20);
                    pb0Var.Z(z20);
                    org.telegram.ui.Cells.r8 r8Var3 = pb0Var.f37064n;
                    if (r8Var3 != null) {
                        if (r8Var2.e.h) {
                            r8Var3.setChecked(false);
                            pb0Var.f37064n.setCheckBoxIcon(R.drawable.permission_locked);
                            pb0Var.f37065r.setVisibility(8);
                            return;
                        } else if (pb0Var.e == null) {
                            r8Var3.setCheckBoxIcon(0);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                og0 og0Var = (og0) this.f15028c;
                boolean z21 = this.f15027b;
                pg0 pg0Var = og0Var.S;
                if (pg0Var.getParentActivity() != null) {
                    boolean z22 = true;
                    boolean z23 = !pg0Var.B;
                    pg0Var.B = z23;
                    ((org.telegram.ui.Cells.y1) view).c(z23, true);
                    if (((z21 && pg0Var.getConnectionsManager().isTestBackend()) ? false : false) != pg0Var.B) {
                        pg0Var.getConnectionsManager().switchBackend(false);
                    }
                    og0Var.s();
                    return;
                }
                return;
        }
    }
}
