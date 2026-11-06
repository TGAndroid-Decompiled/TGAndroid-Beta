package di;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import bi.eb;
import java.net.URLDecoder;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ez;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.kp;
import org.telegram.messenger.p10;
import org.telegram.messenger.pd;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.d41;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.z31;
import org.telegram.ui.an;
public final class n3 extends h8 {
    public final p9 f9396x0;
    public final org.telegram.ui.ActionBar.f6 f9397y0;
    public final i4 f9398z0;

    public n3(i4 i4Var, Context context, b bVar, p9 p9Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, bVar);
        this.f9398z0 = i4Var;
        this.f9396x0 = p9Var;
        this.f9397y0 = f6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.r5 r5Var) {
        if (r5Var != null) {
            i4 i4Var = this.f9398z0;
            if (i4Var.f9221z1 != null) {
                TLRPC.Document document = r5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.i5.e(i4Var.f9168l2, r5Var.documentId);
                }
                if (document != null) {
                    j3 j3Var = i4Var.L0;
                    org.telegram.ui.ActionBar.f6 f6Var = this.f9397y0;
                    cc h = new hc(j3Var, f6Var).h(document, 2, new bi.v3(this, this.f9396x0, f6Var, 1));
                    if (h != null) {
                        h.f32520a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        p9 p9Var = this.f9396x0;
        org.telegram.ui.ActionBar.f2 f2Var = p9Var.f9543f;
        boolean z9 = characterStyle instanceof d41;
        i4 i4Var = this.f9398z0;
        if (z9) {
            TLRPC.User a22 = qp.s1(i4Var.f9168l2).a2(Utilities.A(((d41) characterStyle).getURL()));
            if (a22 != null) {
                qp.s1(i4Var.f9168l2).z3(a22, null, f2Var, 0);
            }
        } else if (characterStyle instanceof a41) {
            String url = ((a41) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    p9Var.N(new r20(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                p9Var.N(new u80(bundle, null));
                return;
            }
            String c10 = vf.c.c(url);
            if (c10 != null) {
                String lowerCase = c10.toLowerCase();
                if (url.startsWith("@")) {
                    qp.s1(i4Var.f9168l2).y3(lowerCase, f2Var, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof c41);
        } else if (characterStyle instanceof z31) {
            z31 z31Var = (z31) characterStyle;
            org.telegram.messenger.g0.g(z31Var.f40857a.subSequence(z31Var.f40858b, z31Var.f40859c).toString());
            org.telegram.messenger.camera.q.r(null, 2131744195, new hc(i4Var.L0, this.f9397y0));
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, s7 s7Var) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = vf.c.w(parse, null, null, vf.c.a(parse.getHost()), null);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.f9397y0;
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
        l10.O = str;
        l10.P = false;
        l10.Q = true;
        i4 i4Var = this.f9398z0;
        g4 g4Var = i4Var.f9213x1;
        CharSequence[] charSequenceArr = (g4Var == null || g4Var.d()) ? new CharSequence[]{hd.M0(2131747816, null), hd.M0(2131751767, null)} : new CharSequence[]{hd.M0(2131747816, null)};
        final org.telegram.ui.ActionBar.f6 f6Var2 = this.f9397y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i7) {
                n3 n3Var = n3.this;
                if (i7 == 0) {
                    n3Var.G(uRLSpan, view);
                } else if (i7 == 1) {
                    org.telegram.messenger.g0.g(url);
                    new hc(n3Var.f9398z0.L0, f6Var2).k(false).j();
                }
            }
        };
        l10.L = charSequenceArr;
        l10.K = onClickListener;
        l10.H0 = new eb(s7Var, 3);
        l10.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, f6Var));
        ((g9) i4Var.f9221z1).h(l10);
    }

    @Override
    public final void I(c8 c8Var) {
        if (c8Var == null) {
            return;
        }
        final TLRPC.Document document = c8Var.f8884g;
        i4 i4Var = this.f9398z0;
        p9 p9Var = this.f9396x0;
        final org.telegram.ui.ActionBar.f6 f6Var = this.f9397y0;
        if (document != null) {
            k60 F = k60.F(p9Var.f9578w, f6Var, i4Var.f9196t0);
            F.f35162i = 3;
            F.a0(-org.telegram.messenger.g0.L(8.0f), 0.0f);
            F.l(2131232351, hd.M0(2131744723, null), new Runnable(this) {
                public final n3 f9284b;

                {
                    this.f9284b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    int i7 = r4;
                    org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                    TLRPC.Document document2 = document;
                    n3 n3Var = this.f9284b;
                    switch (i7) {
                        case 0:
                            i4 i4Var2 = n3Var.f9398z0;
                            gz C = gz.C(i4Var2.f9168l2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = p10.i(i4Var2.f9168l2).e();
                            g4 g4Var = i4Var2.f9213x1;
                            if (g4Var != null) {
                                storyItem = g4Var.f9038a;
                            } else {
                                storyItem = null;
                            }
                            C.r0(ez.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new hc(i4Var2.L0, f6Var2).Q(2131624190, 36, org.telegram.messenger.g0.S2(hd.M0(2131744722, null), -1, 2, new pd(19), null)).k(true);
                            return;
                        default:
                            i4 i4Var3 = n3Var.f9398z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f26980id = tL_inputDocument;
                            tL_inputDocument.f26964id = document2.f26958id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().Q0 != null && MediaController.B().Q0.f23733b == p10.i(i4Var3.f9168l2).e()) {
                                kp kpVar = MediaController.B().Q0;
                                kpVar.f23734c.add(0, kpVar.d(document2));
                                kpVar.e();
                            }
                            ConnectionsManager.getInstance(i4Var3.f9168l2).sendRequest(tL_account_saveMusic, null);
                            new hc(i4Var3.L0, f6Var2).Q(2131624057, 36, hd.M0(2131744724, null)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(2131232401, hd.M0(2131744725, null), new Runnable(this) {
                public final n3 f9284b;

                {
                    this.f9284b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    int i7 = r4;
                    org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                    TLRPC.Document document2 = document;
                    n3 n3Var = this.f9284b;
                    switch (i7) {
                        case 0:
                            i4 i4Var2 = n3Var.f9398z0;
                            gz C = gz.C(i4Var2.f9168l2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = p10.i(i4Var2.f9168l2).e();
                            g4 g4Var = i4Var2.f9213x1;
                            if (g4Var != null) {
                                storyItem = g4Var.f9038a;
                            } else {
                                storyItem = null;
                            }
                            C.r0(ez.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new hc(i4Var2.L0, f6Var2).Q(2131624190, 36, org.telegram.messenger.g0.S2(hd.M0(2131744722, null), -1, 2, new pd(19), null)).k(true);
                            return;
                        default:
                            i4 i4Var3 = n3Var.f9398z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f26980id = tL_inputDocument;
                            tL_inputDocument.f26964id = document2.f26958id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().Q0 != null && MediaController.B().Q0.f23733b == p10.i(i4Var3.f9168l2).e()) {
                                kp kpVar = MediaController.B().Q0;
                                kpVar.f23734c.add(0, kpVar.d(document2));
                                kpVar.e();
                            }
                            ConnectionsManager.getInstance(i4Var3.f9168l2).sendRequest(tL_account_saveMusic, null);
                            new hc(i4Var3.L0, f6Var2).Q(2131624057, 36, hd.M0(2131744724, null)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (c8Var.f8882e && c8Var.f8880b != null && c8Var.d != null) {
            Bundle bundle = new Bundle();
            if (c8Var.f8880b.longValue() >= 0) {
                bundle.putLong("user_id", c8Var.f8880b.longValue());
            } else {
                bundle.putLong("chat_id", -c8Var.f8880b.longValue());
            }
            bundle.putInt("message_id", c8Var.d.intValue());
            p9Var.N(new an(bundle));
        } else if (c8Var.f8880b != null && c8Var.f8881c != null) {
            qp.s1(i4Var.f9168l2).P1().g0(c8Var.f8881c.intValue(), c8Var.f8880b.longValue(), new s2(this, c8Var, p9Var, f6Var, 1));
        } else {
            cc Q = new hc(i4Var.L0, f6Var).Q(2131624011, 36, hd.M0(2131744665, null));
            Q.f32520a = 3;
            Q.k(true);
        }
    }

    public final void M(int i7, String str, CharacterStyle characterStyle, boolean z9) {
        boolean z10;
        ty0 ty0Var;
        if (!z9 && !org.telegram.messenger.g0.J3(str)) {
            if (i7 == 0) {
                vf.c.r(getContext(), Uri.parse(str), true, true, null);
                return;
            } else if (i7 == 1) {
                vf.c.r(getContext(), Uri.parse(str), false, false, null);
                return;
            } else if (i7 == 2) {
                vf.c.r(getContext(), Uri.parse(str), false, true, null);
                return;
            } else {
                return;
            }
        }
        p9 p9Var = this.f9396x0;
        if (i7 != 0 && i7 != 2) {
            if (i7 == 1) {
                org.telegram.ui.Components.v4.o0(p9Var.f9543f, str, true, true, false, false, null, null, this.f9397y0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof c41) && (ty0Var = ((c41) characterStyle).f32404a) != null && (ty0Var.f38433a & 1024) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.v4.o0(p9Var.f9543f, str, true, true, true, z10, null, null, this.f9397y0);
    }
}
