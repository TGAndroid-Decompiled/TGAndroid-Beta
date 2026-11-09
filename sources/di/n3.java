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
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.cn;
public final class n3 extends i8 {
    public final q9 f9387x0;
    public final org.telegram.ui.ActionBar.g6 f9388y0;
    public final j4 f9389z0;

    public n3(j4 j4Var, Context context, b bVar, q9 q9Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, bVar);
        this.f9389z0 = j4Var;
        this.f9387x0 = q9Var;
        this.f9388y0 = g6Var;
    }

    @Override
    public final void F(org.telegram.ui.Components.r5 r5Var) {
        if (r5Var != null) {
            j4 j4Var = this.f9389z0;
            if (j4Var.f9253z1 != null) {
                TLRPC.Document document = r5Var.document;
                if (document == null) {
                    document = org.telegram.ui.Components.i5.e(j4Var.f9200l2, r5Var.documentId);
                }
                if (document != null) {
                    j3 j3Var = j4Var.L0;
                    org.telegram.ui.ActionBar.g6 g6Var = this.f9388y0;
                    cc h = new hc(j3Var, g6Var).h(document, 2, new bi.v3(this, this.f9387x0, g6Var, 1));
                    if (h != null) {
                        h.f32620a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        q9 q9Var = this.f9387x0;
        org.telegram.ui.ActionBar.f2 f2Var = q9Var.f9608f;
        boolean z9 = characterStyle instanceof f41;
        j4 j4Var = this.f9389z0;
        if (z9) {
            TLRPC.User a22 = qp.s1(j4Var.f9200l2).a2(Utilities.A(((f41) characterStyle).getURL()));
            if (a22 != null) {
                qp.s1(j4Var.f9200l2).z3(a22, null, f2Var, 0);
            }
        } else if (characterStyle instanceof c41) {
            String url = ((c41) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    q9Var.N(new s20(url, null));
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
                    qp.s1(j4Var.f9200l2).y3(lowerCase, f2Var, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof e41);
        } else if (characterStyle instanceof b41) {
            b41 b41Var = (b41) characterStyle;
            org.telegram.messenger.g0.g(b41Var.f32098a.subSequence(b41Var.f32099b, b41Var.f32100c).toString());
            org.telegram.messenger.camera.q.r(null, 2131744194, new hc(j4Var.L0, this.f9388y0));
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f9388y0;
        org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, g6Var, false);
        l10.O = str;
        l10.P = false;
        l10.Q = true;
        j4 j4Var = this.f9389z0;
        h4 h4Var = j4Var.f9245x1;
        CharSequence[] charSequenceArr = (h4Var == null || h4Var.d()) ? new CharSequence[]{id.M0(2131747817, null), id.M0(2131751767, null)} : new CharSequence[]{id.M0(2131747817, null)};
        final org.telegram.ui.ActionBar.g6 g6Var2 = this.f9388y0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i7) {
                n3 n3Var = n3.this;
                if (i7 == 0) {
                    n3Var.G(uRLSpan, view);
                } else if (i7 == 1) {
                    org.telegram.messenger.g0.g(url);
                    new hc(n3Var.f9389z0.L0, g6Var2).k(false).j();
                }
            }
        };
        l10.L = charSequenceArr;
        l10.K = onClickListener;
        l10.H0 = new eb(f8Var, 3);
        l10.O(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, g6Var));
        ((h9) j4Var.f9253z1).h(l10);
    }

    @Override
    public final void I(c8 c8Var) {
        if (c8Var == null) {
            return;
        }
        final TLRPC.Document document = c8Var.f8888g;
        j4 j4Var = this.f9389z0;
        q9 q9Var = this.f9387x0;
        final org.telegram.ui.ActionBar.g6 g6Var = this.f9388y0;
        if (document != null) {
            l60 F = l60.F(q9Var.f9643w, g6Var, j4Var.f9228t0);
            F.f35599i = 3;
            F.a0(-org.telegram.messenger.g0.L(8.0f), 0.0f);
            F.l(2131232351, id.M0(2131744722, null), new Runnable(this) {
                public final n3 f9277b;

                {
                    this.f9277b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    int i7 = r4;
                    org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                    TLRPC.Document document2 = document;
                    n3 n3Var = this.f9277b;
                    switch (i7) {
                        case 0:
                            j4 j4Var2 = n3Var.f9389z0;
                            gz C = gz.C(j4Var2.f9200l2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = p10.i(j4Var2.f9200l2).e();
                            h4 h4Var = j4Var2.f9245x1;
                            if (h4Var != null) {
                                storyItem = h4Var.f9064a;
                            } else {
                                storyItem = null;
                            }
                            C.r0(ez.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new hc(j4Var2.L0, g6Var2).Q(2131624190, 36, org.telegram.messenger.g0.S2(id.M0(2131744721, null), -1, 2, new rc(21), null)).k(true);
                            return;
                        default:
                            j4 j4Var3 = n3Var.f9389z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f26984id = tL_inputDocument;
                            tL_inputDocument.f26968id = document2.f26962id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().Q0 != null && MediaController.B().Q0.f23740b == p10.i(j4Var3.f9200l2).e()) {
                                kp kpVar = MediaController.B().Q0;
                                kpVar.f23741c.add(0, kpVar.d(document2));
                                kpVar.e();
                            }
                            ConnectionsManager.getInstance(j4Var3.f9200l2).sendRequest(tL_account_saveMusic, null);
                            new hc(j4Var3.L0, g6Var2).Q(2131624057, 36, id.M0(2131744723, null)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            F.c(2131232401, id.M0(2131744724, null), new Runnable(this) {
                public final n3 f9277b;

                {
                    this.f9277b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    int i7 = r4;
                    org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                    TLRPC.Document document2 = document;
                    n3 n3Var = this.f9277b;
                    switch (i7) {
                        case 0:
                            j4 j4Var2 = n3Var.f9389z0;
                            gz C = gz.C(j4Var2.f9200l2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e10 = p10.i(j4Var2.f9200l2).e();
                            h4 h4Var = j4Var2.f9245x1;
                            if (h4Var != null) {
                                storyItem = h4Var.f9064a;
                            } else {
                                storyItem = null;
                            }
                            C.r0(ez.f(tL_document, null, null, e10, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new hc(j4Var2.L0, g6Var2).Q(2131624190, 36, org.telegram.messenger.g0.S2(id.M0(2131744721, null), -1, 2, new rc(21), null)).k(true);
                            return;
                        default:
                            j4 j4Var3 = n3Var.f9389z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.f26984id = tL_inputDocument;
                            tL_inputDocument.f26968id = document2.f26962id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.B().Q0 != null && MediaController.B().Q0.f23740b == p10.i(j4Var3.f9200l2).e()) {
                                kp kpVar = MediaController.B().Q0;
                                kpVar.f23741c.add(0, kpVar.d(document2));
                                kpVar.e();
                            }
                            ConnectionsManager.getInstance(j4Var3.f9200l2).sendRequest(tL_account_saveMusic, null);
                            new hc(j4Var3.L0, g6Var2).Q(2131624057, 36, id.M0(2131744723, null)).k(true);
                            return;
                    }
                }
            }, false);
            F.Z();
        } else if (c8Var.f8886e && c8Var.f8884b != null && c8Var.d != null) {
            Bundle bundle = new Bundle();
            if (c8Var.f8884b.longValue() >= 0) {
                bundle.putLong("user_id", c8Var.f8884b.longValue());
            } else {
                bundle.putLong("chat_id", -c8Var.f8884b.longValue());
            }
            bundle.putInt("message_id", c8Var.d.intValue());
            q9Var.N(new cn(bundle));
        } else if (c8Var.f8884b != null && c8Var.f8885c != null) {
            qp.s1(j4Var.f9200l2).P1().g0(c8Var.f8885c.intValue(), c8Var.f8884b.longValue(), new s2(this, c8Var, q9Var, g6Var, 1));
        } else {
            cc Q = new hc(j4Var.L0, g6Var).Q(2131624011, 36, id.M0(2131744664, null));
            Q.f32620a = 3;
            Q.k(true);
        }
    }

    public final void M(int i7, String str, CharacterStyle characterStyle, boolean z9) {
        boolean z10;
        vy0 vy0Var;
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
        q9 q9Var = this.f9387x0;
        if (i7 != 0 && i7 != 2) {
            if (i7 == 1) {
                org.telegram.ui.Components.v4.o0(q9Var.f9608f, str, true, true, false, false, null, null, this.f9388y0);
                return;
            }
            return;
        }
        if ((characterStyle instanceof e41) && (vy0Var = ((e41) characterStyle).f33290a) != null && (vy0Var.f39836a & 1024) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.v4.o0(q9Var.f9608f, str, true, true, true, z10, null, null, this.f9388y0);
    }
}
