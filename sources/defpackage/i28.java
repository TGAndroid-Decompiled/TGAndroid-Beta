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
public final class i28 extends k3b {
    public final m8b x0;
    public final f53 y0;
    public final y28 z0;

    public i28(y28 y28Var, Context context, f53 f53Var, m8b m8bVar, f53 f53Var2) {
        super(context, f53Var);
        this.z0 = y28Var;
        this.x0 = m8bVar;
        this.y0 = f53Var2;
    }

    @Override
    public final void F(gm gmVar) {
        if (gmVar != null) {
            y28 y28Var = this.z0;
            if (y28Var.G1 != null) {
                TLRPC.Document document = gmVar.document;
                if (document == null) {
                    document = vl.e(y28Var.s2, gmVar.documentId);
                }
                if (document != null) {
                    d28 d28Var = y28Var.S0;
                    f53 f53Var = this.y0;
                    m21 h = new u21(d28Var, f53Var).h(document, 2, new f28(this, this.x0, f53Var, (byte) 0));
                    if (h != null) {
                        h.a = (byte) 1;
                        h.k(true);
                    }
                }
            }
        }
    }

    @Override
    public final void G(CharacterStyle characterStyle, View view) {
        m8b m8bVar = this.x0;
        d dVar = m8bVar.f;
        boolean z = characterStyle instanceof j4c;
        y28 y28Var = this.z0;
        if (z) {
            TLRPC.User V1 = na7.q1(y28Var.s2).V1(Utilities.A(((j4c) characterStyle).getURL()));
            if (V1 != null) {
                na7.q1(y28Var.s2).B3(V1, null, dVar, 0);
            }
        } else if (characterStyle instanceof g4c) {
            String url = ((g4c) characterStyle).getURL();
            if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                if (url.contains("@")) {
                    m8bVar.L(new tc5(url, null));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                m8bVar.L(new zj6(bundle, null));
                return;
            }
            String c = d01.c(url);
            if (c != null) {
                String lowerCase = c.toLowerCase();
                if (url.startsWith("@")) {
                    na7.q1(y28Var.s2).A3(lowerCase, dVar, 0, null);
                    return;
                } else {
                    M(0, url, characterStyle, false);
                    return;
                }
            }
            M(0, url, characterStyle, false);
        } else if (characterStyle instanceof URLSpan) {
            M(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof i4c);
        } else if (characterStyle instanceof f4c) {
            f4c f4cVar = (f4c) characterStyle;
            gl.g(f4cVar.a.subSequence(f4cVar.b, f4cVar.c).toString());
            new u21(y28Var.S0, this.y0).i(k96.M0(2131743953, null)).j();
        } else if (characterStyle instanceof ClickableSpan) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }

    @Override
    public final void H(final URLSpan uRLSpan, final View view, kya kyaVar) {
        String str;
        final String url = uRLSpan.getURL();
        String url2 = uRLSpan.getURL();
        try {
            try {
                Uri parse = Uri.parse(url2);
                url2 = d01.w(parse, null, null, d01.a(parse.getHost()), null);
            } catch (Exception e) {
                fa4.g(e, false);
            }
            str = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
        } catch (Exception e2) {
            fa4.g(e2, true);
            str = url2;
        }
        try {
            performHapticFeedback(0, 1);
        } catch (Exception unused) {
        }
        Context context = getContext();
        final f53 f53Var = this.y0;
        fx0 fx0Var = new fx0(1, (wjb) f53Var, context, false);
        fx0Var.K();
        fx0Var.P = str;
        fx0Var.Q = false;
        fx0Var.R = true;
        y28 y28Var = this.z0;
        x28 x28Var = y28Var.E1;
        CharSequence[] charSequenceArr = (x28Var == null || x28Var.a()) ? new CharSequence[]{k96.M0(2131747624, null), k96.M0(2131751755, null)} : new CharSequence[]{k96.M0(2131747624, null)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                i28 i28Var = i28.this;
                if (i == 0) {
                    i28Var.G(uRLSpan, view);
                } else if (i == 1) {
                    gl.g(url);
                    new u21(i28Var.z0.S0, f53Var).k(false).j();
                }
            }
        };
        fx0Var.M = charSequenceArr;
        fx0Var.L = onClickListener;
        fx0Var.I0 = new n1(kyaVar, (byte) 28);
        fx0Var.L(bkb.v0(bkb.g5, f53Var));
        ((d8b) y28Var.G1).h(fx0Var);
    }

    @Override
    public final void I(f3b f3bVar) {
        if (f3bVar == null) {
            return;
        }
        final TLRPC.Document document = f3bVar.g;
        y28 y28Var = this.z0;
        m8b m8bVar = this.x0;
        final f53 f53Var = this.y0;
        if (document != null) {
            cs5 G = cs5.G(m8bVar.w, f53Var, y28Var.A0);
            G.i = (byte) 3;
            G.b0(-gl.L(8.0f), 0.0f);
            G.k(2131232356, k96.M0(2131744485, null), new Runnable(this) {
                public final i28 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    byte b = r4;
                    f53 f53Var2 = f53Var;
                    TLRPC.Document document2 = document;
                    i28 i28Var = this.b;
                    switch (b) {
                        case 0:
                            y28 y28Var2 = i28Var.z0;
                            z3a B = z3a.B(y28Var2.s2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e = y6c.h(y28Var2.s2).e();
                            x28 x28Var = y28Var2.E1;
                            if (x28Var != null) {
                                storyItem = x28Var.a;
                            } else {
                                storyItem = null;
                            }
                            B.q0(x3a.f(tL_document, null, null, e, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new u21(y28Var2.S0, f53Var2).Q(2131624185, 36, gl.N2(k96.M0(2131744484, null), -1, 2, new jc((byte) 14), null)).k(true);
                            return;
                        default:
                            y28 y28Var3 = i28Var.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.w().R0 != null && MediaController.w().R0.b == y6c.h(y28Var3.s2).e()) {
                                ia7 ia7Var = MediaController.w().R0;
                                ia7Var.c.add(0, ia7Var.d(document2));
                                ia7Var.e();
                            }
                            ConnectionsManager.getInstance(y28Var3.s2).sendRequest(tL_account_saveMusic, null);
                            new u21(y28Var3.S0, f53Var2).Q(2131624058, 36, k96.M0(2131744486, null)).k(true);
                            return;
                    }
                }
            }, document instanceof TLRPC.TL_document);
            G.b(2131232406, k96.M0(2131744487, null), new Runnable(this) {
                public final i28 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    TL_stories.StoryItem storyItem;
                    byte b = r4;
                    f53 f53Var2 = f53Var;
                    TLRPC.Document document2 = document;
                    i28 i28Var = this.b;
                    switch (b) {
                        case 0:
                            y28 y28Var2 = i28Var.z0;
                            z3a B = z3a.B(y28Var2.s2);
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document2;
                            long e = y6c.h(y28Var2.s2).e();
                            x28 x28Var = y28Var2.E1;
                            if (x28Var != null) {
                                storyItem = x28Var.a;
                            } else {
                                storyItem = null;
                            }
                            B.q0(x3a.f(tL_document, null, null, e, null, null, null, null, null, null, false, 0, 0, 0, storyItem, null, false));
                            new u21(y28Var2.S0, f53Var2).Q(2131624185, 36, gl.N2(k96.M0(2131744484, null), -1, 2, new jc((byte) 14), null)).k(true);
                            return;
                        default:
                            y28 y28Var3 = i28Var.z0;
                            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_account_saveMusic.id = tL_inputDocument;
                            tL_inputDocument.id = document2.id;
                            tL_inputDocument.access_hash = document2.access_hash;
                            tL_inputDocument.file_reference = document2.file_reference;
                            if (MediaController.w().R0 != null && MediaController.w().R0.b == y6c.h(y28Var3.s2).e()) {
                                ia7 ia7Var = MediaController.w().R0;
                                ia7Var.c.add(0, ia7Var.d(document2));
                                ia7Var.e();
                            }
                            ConnectionsManager.getInstance(y28Var3.s2).sendRequest(tL_account_saveMusic, null);
                            new u21(y28Var3.S0, f53Var2).Q(2131624058, 36, k96.M0(2131744486, null)).k(true);
                            return;
                    }
                }
            }, false);
            G.a0();
        } else if (f3bVar.e && f3bVar.b != null && f3bVar.d != null) {
            Bundle bundle = new Bundle();
            int i = (f3bVar.b.longValue() > 0L ? 1 : (f3bVar.b.longValue() == 0L ? 0 : -1));
            Long l = f3bVar.b;
            if (i >= 0) {
                bundle.putLong("user_id", l.longValue());
            } else {
                bundle.putLong("chat_id", -l.longValue());
            }
            bundle.putInt("message_id", f3bVar.d.intValue());
            m8bVar.L(new mu1(bundle));
        } else if (f3bVar.b != null && f3bVar.c != null) {
            na7.q1(y28Var.s2).M1().f0(f3bVar.c.intValue(), f3bVar.b.longValue(), new au0(this, f3bVar, m8bVar, f53Var, (byte) 14));
        } else {
            m21 Q = new u21(y28Var.S0, f53Var).Q(2131624012, 36, k96.M0(2131744424, null));
            Q.a = (byte) 3;
            Q.k(true);
        }
    }

    public final void M(int i, String str, CharacterStyle characterStyle, boolean z) {
        boolean z2;
        vib vibVar;
        if (!z && !gl.D3(str)) {
            if (i == 0) {
                d01.r(getContext(), Uri.parse(str), true, true, null);
                return;
            } else if (i == 1) {
                d01.r(getContext(), Uri.parse(str), false, false, null);
                return;
            } else if (i == 2) {
                d01.r(getContext(), Uri.parse(str), false, true, null);
                return;
            } else {
                return;
            }
        }
        f53 f53Var = this.y0;
        m8b m8bVar = this.x0;
        if (i != 0 && i != 2) {
            if (i == 1) {
                ij.o0(m8bVar.f, str, true, true, false, false, null, null, f53Var);
                return;
            }
            return;
        }
        if ((characterStyle instanceof i4c) && (vibVar = ((i4c) characterStyle).a) != null && (vibVar.a & 1024) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ij.o0(m8bVar.f, str, true, true, true, z2, null, null, f53Var);
    }
}
