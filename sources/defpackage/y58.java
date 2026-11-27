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
import org.telegram.ui.ActionBar.e;
public final class y58 extends g7b {
    public final lcb x0;
    public final x53 y0;
    public final o68 z0;

    public y58(o68 o68Var, Context context, x53 x53Var, lcb lcbVar, x53 x53Var2) {
        super(context, x53Var);
        this.z0 = o68Var;
        this.x0 = lcbVar;
        this.y0 = x53Var2;
    }

    @Override
    public final void F(hm hmVar) {
        if (hmVar != null) {
            o68 o68Var = this.z0;
            if (o68Var.A1 != null) {
                TLRPC.Document document = hmVar.document;
                if (document == null) {
                    document = wl.e(o68Var.m2, hmVar.documentId);
                }
                if (document != null) {
                    t58 t58Var = o68Var.M0;
                    x53 x53Var = this.y0;
                    v21 h = new d31(t58Var, x53Var).h(document, 2, new v58(this, this.x0, x53Var, (byte) 0));
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
        lcb lcbVar = this.x0;
        e eVar = lcbVar.f;
        boolean z = characterStyle instanceof i8c;
        o68 o68Var = this.z0;
        if (z) {
            TLRPC.User X1 = uc7.s1(o68Var.m2).X1(Utilities.A(((i8c) characterStyle).getURL()));
            if (X1 != null) {
                uc7.s1(o68Var.m2).I3(X1, null, eVar, 0);
            }
        } else if (characterStyle instanceof f8c) {
            String url = ((f8c) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    lcbVar.L(new ue5(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                lcbVar.L(new em6(bundle, null));
                return;
            }
            String c = m01.c(url);
            if (c != null) {
                String lowerCase = c.toLowerCase();
                if (url.startsWith("@")) {
                    uc7.s1(o68Var.m2).H3(lowerCase, eVar, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof h8c);
        } else if (characterStyle instanceof e8c) {
            e8c e8cVar = (e8c) characterStyle;
            hl.g(e8cVar.a.subSequence(e8cVar.b, e8cVar.c).toString());
            new d31(o68Var.M0, this.y0).i(ob6.M0(2131743847, null)).j();
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, uoa uoaVar) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = m01.x(parse, null, null, m01.a(parse.getHost()), null);
            } catch (Exception e) {
                cc4.g(e, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e2) {
            cc4.g(e2, true);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        final x53 x53Var = this.y0;
        nx0 nx0Var = new nx0(1, (vnb) x53Var, context, false);
        nx0Var.J();
        nx0Var.P = str;
        nx0Var.Q = false;
        nx0Var.R = true;
        o68 o68Var = this.z0;
        n68 n68Var = o68Var.y1;
        CharSequence[] charSequenceArr = (n68Var == null || n68Var.a()) ? new CharSequence[]{ob6.M0(2131747544, null), ob6.M0(2131751732, null)} : new CharSequence[]{ob6.M0(2131747544, null)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                y58 y58Var = y58.this;
                if (i == 0) {
                    y58Var.G(uRLSpan, view);
                } else if (i == 1) {
                    hl.g(url);
                    new d31(y58Var.z0.M0, x53Var).k(false).j();
                }
            }
        };
        nx0Var.M = charSequenceArr;
        nx0Var.L = onClickListener;
        nx0Var.I0 = new o1(uoaVar, (byte) 28);
        nx0Var.K(aob.v0(aob.h5, x53Var));
        ((ccb) o68Var.A1).h(nx0Var);
    }

    @Override
    public final void I(b7b b7bVar) {
        if (b7bVar == null) {
            return;
        }
        final TLRPC.Document document = b7bVar.g;
        o68 o68Var = this.z0;
        lcb lcbVar = this.x0;
        final x53 x53Var = this.y0;
        if (document != null) {
            fu5 G = fu5.G(lcbVar.w, x53Var, o68Var.u0);
            G.i = (byte) 3;
            G.b0(-hl.L(8.0f), 0.0f);
            G.k(2131232356, ob6.M0(2131744379, null), new Runnable(this) {
                public final y58 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    byte b = r4;
                    x53 x53Var2 = x53Var;
                    TLRPC.Document document2 = document;
                    y58 y58Var = this.b;
                    switch (b) {
                        case 0:
                            o68 o68Var2 = y58Var.z0;
                            r7a B = r7a.B(o68Var2.m2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e = yac.h(o68Var2.m2).e();
                            n68 n68Var = o68Var2.y1;
                            if (n68Var != null) {
                                storyItem = n68Var.a;
                            } else {
                                storyItem = null;
                            }
                            B.q0(p7a.f(tL_document, null, null, e, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new d31(o68Var2.M0, x53Var2).Q(2131624185, 36, hl.N2(ob6.M0(2131744378, null), -1, 2, new kc((byte) 15), null)).k(true);
                            return;
                        default:
                            o68 o68Var3 = y58Var.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.z().R0 != null && MediaController.z().R0.b == yac.h(o68Var3.m2).e()) {
                                pc7 pc7Var = MediaController.z().R0;
                                pc7Var.c.add(0, pc7Var.d(document2));
                                pc7Var.e();
                            }
                            ConnectionsManager.getInstance(o68Var3.m2).sendRequest(tL_account_saveMusic, null);
                            new d31(o68Var3.M0, x53Var2).Q(2131624058, 36, ob6.M0(2131744380, null)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            G.b(2131232406, ob6.M0(2131744381, null), new Runnable(this) {
                public final y58 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    byte b = r4;
                    x53 x53Var2 = x53Var;
                    TLRPC.Document document2 = document;
                    y58 y58Var = this.b;
                    switch (b) {
                        case 0:
                            o68 o68Var2 = y58Var.z0;
                            r7a B = r7a.B(o68Var2.m2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e = yac.h(o68Var2.m2).e();
                            n68 n68Var = o68Var2.y1;
                            if (n68Var != null) {
                                storyItem = n68Var.a;
                            } else {
                                storyItem = null;
                            }
                            B.q0(p7a.f(tL_document, null, null, e, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new d31(o68Var2.M0, x53Var2).Q(2131624185, 36, hl.N2(ob6.M0(2131744378, null), -1, 2, new kc((byte) 15), null)).k(true);
                            return;
                        default:
                            o68 o68Var3 = y58Var.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.z().R0 != null && MediaController.z().R0.b == yac.h(o68Var3.m2).e()) {
                                pc7 pc7Var = MediaController.z().R0;
                                pc7Var.c.add(0, pc7Var.d(document2));
                                pc7Var.e();
                            }
                            ConnectionsManager.getInstance(o68Var3.m2).sendRequest(tL_account_saveMusic, null);
                            new d31(o68Var3.M0, x53Var2).Q(2131624058, 36, ob6.M0(2131744380, null)).k(true);
                            return;
                    }
                }
            }, false);
            G.a0();
        } else if (b7bVar.e && b7bVar.b != null && b7bVar.d != null) {
            Bundle bundle = new Bundle();
            int i = (b7bVar.b.longValue() > 0L ? 1 : (b7bVar.b.longValue() == 0L ? 0 : -1));
            Long l = b7bVar.b;
            if (i >= 0) {
                bundle.putLong("user_id", l.longValue());
            } else {
                bundle.putLong("chat_id", -l.longValue());
            }
            bundle.putInt("message_id", b7bVar.d.intValue());
            lcbVar.L(new zu1(bundle));
        } else if (b7bVar.b != null && b7bVar.c != null) {
            uc7.s1(o68Var.m2).O1().f0(b7bVar.c.intValue(), b7bVar.b.longValue(), new ku0(this, b7bVar, lcbVar, x53Var, (byte) 14));
        } else {
            v21 Q = new d31(o68Var.M0, x53Var).Q(2131624012, 36, ob6.M0(2131744318, null));
            Q.a = 3;
            Q.k(true);
        }
    }

    public final void M(int i, String str, CharacterStyle characterStyle, boolean z) {
        boolean z2;
        rmb rmbVar;
        if (!z && !hl.D3(str)) {
            if (i == 0) {
                m01.s(getContext(), Uri.parse(str), true, true, null);
                return;
            } else if (i == 1) {
                m01.s(getContext(), Uri.parse(str), false, false, null);
                return;
            } else if (i == 2) {
                m01.s(getContext(), Uri.parse(str), false, true, null);
                return;
            } else {
                return;
            }
        }
        x53 x53Var = this.y0;
        lcb lcbVar = this.x0;
        if (i != 0 && i != 2) {
            if (i == 1) {
                jj.o0(lcbVar.f, str, true, true, false, false, null, null, x53Var);
                return;
            }
            return;
        }
        if ((characterStyle instanceof h8c) && (rmbVar = ((h8c) characterStyle).a) != null && (rmbVar.a & 1024) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        jj.o0(lcbVar.f, str, true, true, true, z2, null, null, x53Var);
    }
}
