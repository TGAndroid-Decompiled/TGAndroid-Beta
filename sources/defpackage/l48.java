package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import java.net.URLDecoder;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public final class l48 extends l5b {
    public final oab x0;
    public final r63 y0;
    public final a58 z0;

    public l48(a58 a58Var, Context context, r63 r63Var, oab oabVar, r63 r63Var2) {
        super(context, r63Var);
        this.z0 = a58Var;
        this.x0 = oabVar;
        this.y0 = r63Var2;
    }

    @Override
    public final void F(gn gnVar) {
        if (gnVar != null) {
            a58 a58Var = this.z0;
            if (a58Var.G1 != null) {
                TLRPC.Document document = gnVar.document;
                if (document == null) {
                    document = vm.e(a58Var.s2, gnVar.documentId);
                }
                if (document != null) {
                    g48 g48Var = a58Var.S0;
                    r63 r63Var = this.y0;
                    u31 h = new c41(g48Var, r63Var).h(document, 2, new i48(this, this.x0, r63Var, (byte) 0));
                    if (h != null) {
                        h.a = 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        oab oabVar = this.x0;
        d dVar = oabVar.f;
        boolean z = characterStyle instanceof j6c;
        a58 a58Var = this.z0;
        if (z) {
            TLRPC.User W1 = oc7.r1(a58Var.s2).W1(Utilities.A(((j6c) characterStyle).getURL()));
            if (W1 != null) {
                oc7.r1(a58Var.s2).D3(W1, null, dVar, 0);
            }
        } else if (characterStyle instanceof g6c) {
            String url = ((g6c) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    oabVar.L(new re5(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                oabVar.L(new cm6(bundle, null));
                return;
            }
            String c = l11.c(url);
            if (c != null) {
                String lowerCase = c.toLowerCase();
                if (url.startsWith("@")) {
                    oc7.r1(a58Var.s2).C3(lowerCase, dVar, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof i6c);
        } else if (characterStyle instanceof f6c) {
            f6c f6cVar = (f6c) characterStyle;
            gm.g(f6cVar.a.subSequence(f6cVar.b, f6cVar.c).toString());
            new c41(a58Var.S0, this.y0).i(jb6.M0(2131743879, null)).j();
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, nsa nsaVar) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = l11.x(parse, null, null, l11.a(parse.getHost()), null);
            } catch (Exception e) {
                fc4.g(e, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e2) {
            fc4.g(e2, true);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        final r63 r63Var = this.y0;
        my0 my0Var = new my0(1, (ylb) r63Var, context, false);
        my0Var.J();
        my0Var.P = str;
        my0Var.Q = false;
        my0Var.R = true;
        a58 a58Var = this.z0;
        z48 z48Var = a58Var.E1;
        CharSequence[] charSequenceArr = (z48Var == null || z48Var.a()) ? new CharSequence[]{jb6.M0(2131747550, null), jb6.M0(2131751704, null)} : new CharSequence[]{jb6.M0(2131747550, null)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                l48 l48Var = l48.this;
                if (i == 0) {
                    l48Var.G(uRLSpan, view);
                } else if (i == 1) {
                    gm.g(url);
                    new c41(l48Var.z0.S0, r63Var).k(false).j();
                }
            }
        };
        my0Var.M = charSequenceArr;
        my0Var.L = onClickListener;
        my0Var.I0 = new n1(nsaVar, (byte) 28);
        my0Var.K(cmb.v0(cmb.g5, r63Var));
        ((fab) a58Var.G1).h(my0Var);
    }

    @Override
    public final void I(g5b g5bVar) {
        if (g5bVar == null) {
            return;
        }
        final TLRPC.Document document = g5bVar.g;
        a58 a58Var = this.z0;
        oab oabVar = this.x0;
        final r63 r63Var = this.y0;
        if (document != null) {
            bu5 G = bu5.G(oabVar.w, r63Var, a58Var.A0);
            G.i = (byte) 3;
            G.b0(-gm.L(8.0f), 0.0f);
            G.k(2131232357, jb6.M0(2131744411, null), new Runnable(this) {
                public final l48 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    byte b = r4;
                    r63 r63Var2 = r63Var;
                    TLRPC.Document document2 = document;
                    l48 l48Var = this.b;
                    switch (b) {
                        case 0:
                            a58 a58Var2 = l48Var.z0;
                            a6a B = a6a.B(a58Var2.s2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e = z8c.h(a58Var2.s2).e();
                            z48 z48Var = a58Var2.E1;
                            if (z48Var != null) {
                                storyItem = z48Var.a;
                            } else {
                                storyItem = null;
                            }
                            B.q0(y5a.f(tL_document, null, null, e, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new c41(a58Var2.S0, r63Var2).Q(2131624185, 36, gm.N2(jb6.M0(2131744410, null), -1, 2, new jd((byte) 14), null)).k(true);
                            return;
                        default:
                            a58 a58Var3 = l48Var.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.w().R0 != null && MediaController.w().R0.b == z8c.h(a58Var3.s2).e()) {
                                jc7 jc7Var = MediaController.w().R0;
                                jc7Var.c.add(0, jc7Var.d(document2));
                                jc7Var.e();
                            }
                            ConnectionsManager.getInstance(a58Var3.s2).sendRequest(tL_account_saveMusic, null);
                            new c41(a58Var3.S0, r63Var2).Q(2131624058, 36, jb6.M0(2131744412, null)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            G.b(2131232407, jb6.M0(2131744413, null), new Runnable(this) {
                public final l48 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    byte b = r4;
                    r63 r63Var2 = r63Var;
                    TLRPC.Document document2 = document;
                    l48 l48Var = this.b;
                    switch (b) {
                        case 0:
                            a58 a58Var2 = l48Var.z0;
                            a6a B = a6a.B(a58Var2.s2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e = z8c.h(a58Var2.s2).e();
                            z48 z48Var = a58Var2.E1;
                            if (z48Var != null) {
                                storyItem = z48Var.a;
                            } else {
                                storyItem = null;
                            }
                            B.q0(y5a.f(tL_document, null, null, e, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new c41(a58Var2.S0, r63Var2).Q(2131624185, 36, gm.N2(jb6.M0(2131744410, null), -1, 2, new jd((byte) 14), null)).k(true);
                            return;
                        default:
                            a58 a58Var3 = l48Var.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.w().R0 != null && MediaController.w().R0.b == z8c.h(a58Var3.s2).e()) {
                                jc7 jc7Var = MediaController.w().R0;
                                jc7Var.c.add(0, jc7Var.d(document2));
                                jc7Var.e();
                            }
                            ConnectionsManager.getInstance(a58Var3.s2).sendRequest(tL_account_saveMusic, null);
                            new c41(a58Var3.S0, r63Var2).Q(2131624058, 36, jb6.M0(2131744412, null)).k(true);
                            return;
                    }
                }
            }, false);
            G.a0();
        } else if (g5bVar.e && g5bVar.b != null && g5bVar.d != null) {
            Bundle bundle = new Bundle();
            int i = (g5bVar.b.longValue() > 0L ? 1 : (g5bVar.b.longValue() == 0L ? 0 : -1));
            Long l = g5bVar.b;
            if (i >= 0) {
                bundle.putLong("user_id", l.longValue());
            } else {
                bundle.putLong("chat_id", -l.longValue());
            }
            bundle.putInt("message_id", g5bVar.d.intValue());
            oabVar.L(new yv1(bundle));
        } else if (g5bVar.b != null && g5bVar.c != null) {
            oc7.r1(a58Var.s2).N1().f0(g5bVar.c.intValue(), g5bVar.b.longValue(), new jv0(this, g5bVar, oabVar, r63Var, (byte) 14));
        } else {
            u31 Q = new c41(a58Var.S0, r63Var).Q(2131624012, 36, jb6.M0(2131744350, null));
            Q.a = 3;
            Q.k(true);
        }
    }

    public final void M(int i, String str, CharacterStyle characterStyle, boolean z) {
        boolean z2;
        wkb wkbVar;
        if (!z && !gm.D3(str)) {
            if (i == 0) {
                l11.s(getContext(), Uri.parse(str), true, true, null);
                return;
            } else if (i == 1) {
                l11.s(getContext(), Uri.parse(str), false, false, null);
                return;
            } else if (i == 2) {
                l11.s(getContext(), Uri.parse(str), false, true, null);
                return;
            } else {
                return;
            }
        }
        r63 r63Var = this.y0;
        oab oabVar = this.x0;
        if (i != 0 && i != 2) {
            if (i == 1) {
                ik.o0(oabVar.f, str, true, true, false, false, null, null, r63Var);
                return;
            }
            return;
        }
        if ((characterStyle instanceof i6c) && (wkbVar = ((i6c) characterStyle).a) != null && (wkbVar.a & 1024) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ik.o0(oabVar.f, str, true, true, true, z2, null, null, r63Var);
    }
}
