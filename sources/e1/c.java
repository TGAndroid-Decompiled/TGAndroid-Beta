package e1;

import ag.r0;
import ai.i;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b2.e1;
import b2.f;
import b2.u0;
import b2.u1;
import b2.z0;
import bi.ad;
import bi.cd;
import c3.g;
import c3.u;
import com.google.android.gms.tasks.OnSuccessListener;
import e2.n0;
import e2.o;
import e2.x;
import f2.w;
import f9.g1;
import f9.l1;
import fi.gb;
import fi.ia;
import fi.ib;
import fi.ka;
import fi.ma;
import fi.n1;
import fi.o9;
import fi.r;
import fi.s6;
import fi.s9;
import fi.sb;
import fi.t5;
import fi.ta;
import fi.w6;
import fi.w7;
import hi.b5;
import hi.k;
import hi.m;
import hi.q;
import i2.d0;
import j4.c0;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import n4.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.us0;
import rg.s1;
public final class c implements OnSuccessListener, Utilities.Callback2Return, bm0, g1, b2, ol0, Utilities.Callback5, s1, CameraController.VideoTakeCallback, jw0, g, o, w {
    public final int f9613a;
    public final Object f9614b;

    public c(j2.a aVar, Object obj, int i10) {
        this.f9613a = i10;
        this.f9614b = obj;
    }

    @Override
    public void a() {
        float f7;
        ta taVar = (ta) this.f9614b;
        TextView textView = taVar.f10784d1;
        boolean a2 = taVar.f10812s0.a();
        ImageView imageView = taVar.f10782c1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f10 = 0.6f;
        if (a2) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        animate.alpha(f7).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a2) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override
    public float b(RecyclerView recyclerView) {
        return b10.c(recyclerView);
    }

    @Override
    public boolean c(int r6, android.view.View r7) {
        throw new UnsupportedOperationException("Method not decompiled: e1.c.c(int, android.view.View):boolean");
    }

    @Override
    public void d() {
        ((n1) this.f9614b).invalidate();
    }

    @Override
    public void e(long j10, x xVar) {
        switch (this.f9613a) {
            case 28:
                c3.b.c(j10, xVar, ((c0) this.f9614b).f15262c);
                return;
            default:
                c3.b.d(j10, xVar, ((c0) this.f9614b).f15262c);
                return;
        }
    }

    @Override
    public long g(long j10) {
        u uVar = (u) this.f9614b;
        return n0.j((j10 * uVar.e) / 1000000, 0L, uVar.f6102j - 1);
    }

    @Override
    public void h(e2 e2Var, int i10) {
        switch (this.f9613a) {
            case 5:
                sb sbVar = ((ib) ((r) this.f9614b)).S1;
                gb gbVar = sbVar.X0;
                if (gbVar != null) {
                    gbVar.s(null, null, true);
                }
                ta taVar = sbVar.f11673v1;
                if (taVar != null) {
                    taVar.n0();
                }
                ib ibVar = sbVar.f11614c1;
                if (ibVar != null) {
                    ibVar.setHasRoundVideo(false);
                }
                w7 w7Var = sbVar.K1;
                if (w7Var != null) {
                    File file = w7Var.f11918o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        sbVar.K1.f11918o0 = null;
                    }
                    if (sbVar.K1.f11920p0 != null) {
                        try {
                            new File(sbVar.K1.f11920p0).delete();
                        } catch (Exception unused2) {
                        }
                        sbVar.K1.f11920p0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((t5) this.f9614b).f11708a.f10787e2.r();
                return;
            case 14:
                ((hi.d) this.f9614b).run();
                return;
            default:
                k kVar = (k) this.f9614b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = kVar.getMessagesController().getInputUser(kVar.R);
                updatestarrefprogram.commission_permille = 0;
                e2 e2Var2 = new e2(kVar.getParentActivity(), 3, null);
                e2Var2.r(150L);
                kVar.getConnectionsManager().sendRequest(updatestarrefprogram, new hi.b(kVar, e2Var2, 0));
                return;
        }
    }

    @Override
    public RecyclerView i(View view) {
        ((cd) this.f9614b).getClass();
        return ((ad) view).f4289a;
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f9613a) {
            case 18:
                ((e1) obj).onAudioAttributesChanged((f) this.f9614b);
                return;
            case 19:
                ((e1) obj).onTrackSelectionParametersChanged((u1) this.f9614b);
                return;
            case 20:
                ((e1) obj).onCues((d2.c) this.f9614b);
                return;
            case 21:
                ((e1) obj).onMediaMetadataChanged(((d0) this.f9614b).f13509a.Q);
                return;
            case 22:
                ((e1) obj).onMetadata((u0) this.f9614b);
                return;
            case 23:
            default:
                ((j2.b) obj).b((u2.c0) this.f9614b);
                return;
            case 24:
                ((j2.b) obj).h((z0) this.f9614b);
                return;
            case 25:
                ((j2.b) obj).onSeekStarted((j2.a) this.f9614b);
                return;
            case 26:
                ((j2.b) obj).a((i2.e) this.f9614b);
                return;
        }
    }

    @Override
    public Object l(Object obj, Object obj2) {
        return f9.o.x((List) ((Collection) obj2), new s(17, ((l1) this.f9614b).f10300f, obj));
    }

    @Override
    public void n(RecyclerView recyclerView) {
        b10.b(recyclerView);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        ma maVar = (ma) this.f9614b;
        sb sbVar = maVar.f11270a;
        w6 w6Var = sbVar.O0;
        int i10 = sbVar.f11612c;
        if (w6Var != null) {
            w6Var.g(true);
        }
        if (sbVar.p0()) {
            sbVar.f11662s.d();
        }
        if (sbVar.G1 != null && sbVar.B0 != null) {
            sbVar.Q1 = false;
            sbVar.R1 = false;
            s6 s6Var = sbVar.C0;
            if (s6Var != null) {
                s6Var.c(false);
            }
            if (j10 <= 800) {
                sbVar.g(false, true);
                sbVar.c0(false);
                sbVar.J0.b(false, true);
                w6 w6Var2 = sbVar.O0;
                if (w6Var2 != null) {
                    w6Var2.g(true);
                }
                try {
                    sbVar.G1.delete();
                    sbVar.G1 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            }
            sbVar.h0(false, true);
            w7 o10 = w7.o(sbVar.G1, str, j10);
            o10.J0 = sbVar.f11672v0;
            o10.K0 = sbVar.f11676w0;
            o10.B();
            sbVar.g(false, true);
            sbVar.c0(false);
            sbVar.J0.b(false, true);
            w6 w6Var3 = sbVar.O0;
            if (w6Var3 != null) {
                w6Var3.g(true);
            }
            if (sbVar.A0.j()) {
                sbVar.G1 = null;
                o10.P = 1.0f;
                if (sbVar.A0.l(o10)) {
                    w7 a2 = w7.a(sbVar.A0.getLayout(), sbVar.A0.getContent());
                    sbVar.K1 = a2;
                    o9.a(i10, a2);
                    sbVar.L1 = false;
                    int videoWidth = sbVar.B0.getVideoWidth();
                    int videoHeight = sbVar.B0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        w7 w7Var = sbVar.K1;
                        w7Var.f11911k0 = videoWidth;
                        w7Var.f11913l0 = videoHeight;
                        w7Var.A();
                    }
                }
                sbVar.l0(true);
                return;
            }
            sbVar.K1 = o10;
            o9.a(i10, o10);
            sbVar.L1 = false;
            int videoWidth2 = sbVar.B0.getVideoWidth();
            int videoHeight2 = sbVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                w7 w7Var2 = sbVar.K1;
                w7Var2.f11911k0 = videoWidth2;
                w7Var2.f11913l0 = videoHeight2;
                w7Var2.A();
            }
            sbVar.K(new ka(maVar, 3), 0L);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        switch (this.f9613a) {
            case 0:
                ((b) this.f9614b).invoke(obj);
                return;
            default:
                ((b) this.f9614b).invoke(obj);
                return;
        }
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f9613a) {
            case 8:
                ia iaVar = (ia) this.f9614b;
                t61 t61Var = (t61) obj;
                View view = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = t61Var.d;
                w7 w7Var = (w7) t61Var.G;
                iaVar.c(false, true);
                sb sbVar = iaVar.O;
                if (w7Var == sbVar.K1 || sbVar.X1) {
                    return;
                }
                sbVar.f11617d1.setSelected(i10);
                sbVar.X1 = true;
                r0 r0Var = new r0(sbVar, i10, 10);
                ta taVar = sbVar.f11673v1;
                w7 w7Var2 = sbVar.K1;
                if (taVar != null && w7Var2 != null) {
                    if (!taVar.r0()) {
                        r0Var.run();
                        return;
                    }
                    w7Var2.f();
                    boolean r02 = taVar.r0();
                    Utilities.searchQueue.postRunnable(new s9(sbVar, taVar, w7Var2.f11907i0, w7Var2.f11909j0, w7Var2, taVar.D0.getPainting().E, r02, r0Var, 0));
                    return;
                }
                r0Var.run();
                return;
            case 16:
                q qVar = (q) this.f9614b;
                t61 t61Var2 = (t61) obj;
                View view2 = (View) obj2;
                Integer num = (Integer) obj3;
                Float f7 = (Float) obj4;
                Float f10 = (Float) obj5;
                if (!qVar.f13223q0 && t61Var2.d == 1) {
                    Object obj6 = t61Var2.G;
                    if (obj6 instanceof TL_agent.agentProvider) {
                        TL_agent.agentProvider agentprovider = (TL_agent.agentProvider) obj6;
                        qVar.f13222p0 = agentprovider;
                        qVar.f13219l0.setText("");
                        qVar.U(false);
                        qVar.f13221o0.i(LocaleController.formatString(R.string.AgentConnectProvider, agentprovider.title), false, true);
                        qVar.V();
                        qVar.f13214g0.f32150g3.O(false);
                        qVar.f13212e0.b(1, true);
                        AndroidUtilities.runOnUIThread(new m(qVar, 1), 250L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view3 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                ((b5) this.f9614b).W((t61) obj);
                return;
        }
    }

    public c(j2.a aVar, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        this.f9613a = 27;
        this.f9614b = c0Var;
    }

    public c(Object obj, int i10) {
        this.f9613a = i10;
        this.f9614b = obj;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        us0 us0Var = (us0) this.f9614b;
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == -1) {
            new ei.u(us0Var.f10015a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new i(us0Var, 14)).show();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
