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
import org.telegram.messenger.id;
import org.telegram.messenger.kp;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.rc;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.d41;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.v80;
import org.telegram.ui.cn;
public final class n3 extends i8 {
    public final q9 f9392x0;
    public final org.telegram.ui.ActionBar.h6 f9393y0;
    public final j4 f9394z0;

    public n3(j4 j4Var, Context context, b bVar, q9 q9Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, bVar);
        this.f9394z0 = j4Var;
        this.f9392x0 = q9Var;
        this.f9393y0 = h6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.q5 q5Var) {
        if (q5Var != null) {
            j4 j4Var = this.f9394z0;
            if (j4Var.f9258z1 != null) {
                TLRPC.Document document = q5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.h5.e(j4Var.f9205l2, q5Var.documentId);
                }
                if (document != null) {
                    j3 j3Var = j4Var.L0;
                    org.telegram.ui.ActionBar.h6 h6Var = this.f9393y0;
                    bc h = new gc(j3Var, h6Var).h(document, 2, new bi.v3(this, this.f9392x0, h6Var, 1));
                    if (h != null) {
                        h.f32196a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        q9 q9Var = this.f9392x0;
        org.telegram.ui.ActionBar.f2 f2Var = q9Var.f9613f;
        boolean z9 = characterStyle instanceof e41;
        j4 j4Var = this.f9394z0;
        if (z9) {
            TLRPC.User a22 = qp.s1(j4Var.f9205l2).a2(Utilities.A(((e41) characterStyle).getURL()));
            if (a22 != null) {
                qp.s1(j4Var.f9205l2).z3(a22, null, f2Var, 0);
            }
        } else if (characterStyle instanceof b41) {
            String url = ((b41) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    q9Var.N(new r20(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                q9Var.N(new v80(bundle, null));
                return;
            }
            String c10 = vf.c.c(url);
            if (c10 != null) {
                String lowerCase = c10.toLowerCase();
                if (url.startsWith("@")) {
                    qp.s1(j4Var.f9205l2).y3(lowerCase, f2Var, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof d41);
        } else if (characterStyle instanceof a41) {
            a41 a41Var = (a41) characterStyle;
            org.telegram.messenger.g0.g(a41Var.f31703a.subSequence(a41Var.f31704b, a41Var.f31705c).toString());
            org.telegram.messenger.camera.q.r(null, 2131744194, new gc(j4Var.L0, this.f9393y0));
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, f8 f8Var) {
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
        org.telegram.ui.ActionBar.h6 h6Var = this.f9393y0;
        org.telegram.ui.ActionBar.w2 l10 = org.telegram.messenger.k5.l(1, context, h6Var, false);
        l10.O = str;
        l10.P = false;
        l10.Q = true;
        j4 j4Var = this.f9394z0;
        h4 h4Var = j4Var.f9250x1;
        CharSequence[] charSequenceArr = (h4Var == null || h4Var.d()) ? new CharSequence[]{id.M0(2131747817, null), id.M0(2131751767, null)} : new CharSequence[]{id.M0(2131747817, null)};
        final org.telegram.ui.ActionBar.h6 h6Var2 = this.f9393y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i7) {
                n3 n3Var = n3.this;
                if (i7 == 0) {
                    n3Var.G(uRLSpan, view);
                } else if (i7 == 1) {
                    org.telegram.messenger.g0.g(url);
                    new gc(n3Var.f9394z0.L0, h6Var2).k(false).j();
                }
            }
        };
        l10.L = charSequenceArr;
        l10.K = onClickListener;
        l10.H0 = new eb(f8Var, 3);
        l10.O(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, h6Var));
        ((h9) j4Var.f9258z1).h(l10);
    }

    @Override
    public final void I(c8 c8Var) {
        if (c8Var == null) {
            return;
        }
        final TLRPC.Document document = c8Var.f8893g;
        j4 j4Var = this.f9394z0;
        q9 q9Var = this.f9392x0;
        final org.telegram.ui.ActionBar.h6 h6Var = this.f9393y0;
        if (document != null) {
            k60 F = k60.F(q9Var.f9648w, h6Var, j4Var.f9233t0);
            F.f35201i = 3;
            F.a0(-org.telegram.messenger.g0.L(8.0f), 0.0f);
            F.l(2131232351, id.M0(2131744722, null), new Runnable(this) {
                public final n3 f9282b;

                {
                    this.f9282b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    int i7 = r4;
                    org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                    TLRPC.Document document2 = document;
                    n3 n3Var = this.f9282b;
                    switch (i7) {
                        case 0:
                            j4 j4Var2 = n3Var.f9394z0;
                            gz C = gz.C(j4Var2.f9205l2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = p10.i(j4Var2.f9205l2).e();
                            h4 h4Var = j4Var2.f9250x1;
                            if (h4Var != null) {
                                storyItem = h4Var.f9069a;
                            } else {
                                storyItem = null;
                            }
                            C.r0(ez.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new gc(j4Var2.L0, h6Var2).Q(2131624190, 36, org.telegram.messenger.g0.S2(id.M0(2131744721, null), -1, 2, new rc(21), null)).k(true);
                            return;
                        default:
                            j4 j4Var3 = n3Var.f9394z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f26988id = tL_inputDocument;
                            tL_inputDocument.f26972id = document2.f26966id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().Q0 != null && MediaController.B().Q0.f23744b == p10.i(j4Var3.f9205l2).e()) {
                                kp kpVar = MediaController.B().Q0;
                                kpVar.f23745c.add(0, kpVar.d(document2));
                                kpVar.e();
                            }
                            ConnectionsManager.getInstance(j4Var3.f9205l2).sendRequest(tL_account_saveMusic, null);
                            new gc(j4Var3.L0, h6Var2).Q(2131624057, 36, id.M0(2131744723, null)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(2131232401, id.M0(2131744724, null), new Runnable(this) {
                public final n3 f9282b;

                {
                    this.f9282b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    int i7 = r4;
                    org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                    TLRPC.Document document2 = document;
                    n3 n3Var = this.f9282b;
                    switch (i7) {
                        case 0:
                            j4 j4Var2 = n3Var.f9394z0;
                            gz C = gz.C(j4Var2.f9205l2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = p10.i(j4Var2.f9205l2).e();
                            h4 h4Var = j4Var2.f9250x1;
                            if (h4Var != null) {
                                storyItem = h4Var.f9069a;
                            } else {
                                storyItem = null;
                            }
                            C.r0(ez.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new gc(j4Var2.L0, h6Var2).Q(2131624190, 36, org.telegram.messenger.g0.S2(id.M0(2131744721, null), -1, 2, new rc(21), null)).k(true);
                            return;
                        default:
                            j4 j4Var3 = n3Var.f9394z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f26988id = tL_inputDocument;
                            tL_inputDocument.f26972id = document2.f26966id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().Q0 != null && MediaController.B().Q0.f23744b == p10.i(j4Var3.f9205l2).e()) {
                                kp kpVar = MediaController.B().Q0;
                                kpVar.f23745c.add(0, kpVar.d(document2));
                                kpVar.e();
                            }
                            ConnectionsManager.getInstance(j4Var3.f9205l2).sendRequest(tL_account_saveMusic, null);
                            new gc(j4Var3.L0, h6Var2).Q(2131624057, 36, id.M0(2131744723, null)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (c8Var.f8891e && c8Var.f8889b != null && c8Var.d != null) {
            Bundle bundle = new Bundle();
            if (c8Var.f8889b.longValue() >= 0) {
                bundle.putLong("user_id", c8Var.f8889b.longValue());
            } else {
                bundle.putLong("chat_id", -c8Var.f8889b.longValue());
            }
            bundle.putInt("message_id", c8Var.d.intValue());
            q9Var.N(new cn(bundle));
        } else if (c8Var.f8889b != null && c8Var.f8890c != null) {
            qp.s1(j4Var.f9205l2).P1().g0(c8Var.f8890c.intValue(), c8Var.f8889b.longValue(), new s2(this, c8Var, q9Var, h6Var, 1));
        } else {
            bc Q = new gc(j4Var.L0, h6Var).Q(2131624011, 36, id.M0(2131744664, null));
            Q.f32196a = 3;
            Q.k(true);
        }
    }

    public final void M(int i7, String str, CharacterStyle characterStyle, boolean z9) {
        boolean z10;
        uy0 uy0Var;
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
        q9 q9Var = this.f9392x0;
        if (i7 != 0 && i7 != 2) {
            if (i7 == 1) {
                org.telegram.ui.Components.u4.o0(q9Var.f9613f, str, true, true, false, false, null, null, this.f9393y0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof d41) && (uy0Var = ((d41) characterStyle).f32885a) != null && (uy0Var.f38777a & 1024) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.u4.o0(q9Var.f9613f, str, true, true, true, z10, null, null, this.f9393y0);
    }
}
