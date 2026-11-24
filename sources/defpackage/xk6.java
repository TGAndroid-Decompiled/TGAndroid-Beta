package defpackage;

import org.telegram.tgnet.tl.TL_iv;
public final class xk6 extends knd {
    public int a;
    public final TL_iv.PageBlock b;
    public TL_iv.textConcat c = new TL_iv.textConcat();

    public xk6(TL_iv.PageBlock pageBlock) {
        this.b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        if (textconcat.texts.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        if (textconcat.texts.size() == 1) {
            return textconcat.texts.get(0);
        }
        return textconcat;
    }

    @Override
    public final void a(il0 il0Var) {
        int i = this.a;
        if (i >= 64) {
            return;
        }
        this.a = i + 1;
        try {
            v(il0Var);
        } finally {
            this.a--;
        }
    }

    @Override
    public final void b(f21 f21Var) {
        int i = this.a;
        if (i >= 64) {
            return;
        }
        this.a = i + 1;
        try {
            v(f21Var);
        } finally {
            this.a--;
        }
    }

    @Override
    public final void c(qk2 qk2Var) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = al6.l(qk2Var.h);
        w(textfixed);
    }

    @Override
    public final void d(z53 z53Var) {
        if (z53Var instanceof zab) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(z53Var);
            w(textstrike);
        } else if (z53Var instanceof su5) {
            w(al6.h(((su5) z53Var).g));
        } else {
            v(z53Var);
        }
    }

    @Override
    public final void e(f34 f34Var) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(f34Var);
        w(textitalic);
    }

    @Override
    public final void i(bm5 bm5Var) {
        w(y(bm5Var));
    }

    @Override
    public final void k(y66 y66Var) {
        if (y66Var instanceof pu5) {
            if (!this.c.texts.isEmpty()) {
                w(al6.l("\n"));
            }
            w(al6.h(((pu5) y66Var).g));
            w(al6.l("\n"));
            return;
        }
        v(y66Var);
    }

    @Override
    public final void l(f76 f76Var) {
        int i = this.a;
        if (i >= 64) {
            return;
        }
        this.a = i + 1;
        try {
            v(f76Var);
        } finally {
            this.a--;
        }
    }

    @Override
    public final void m(zs7 zs7Var) {
        int i = this.a;
        if (i >= 64) {
            return;
        }
        this.a = i + 1;
        try {
            v(zs7Var);
        } finally {
            this.a--;
        }
    }

    @Override
    public final void n(uw7 uw7Var) {
        if (!this.c.texts.isEmpty()) {
            w(al6.l("\n\n"));
        }
        v(uw7Var);
    }

    @Override
    public final void o(vib vibVar) {
        w(al6.l(vibVar.g));
    }

    @Override
    public final void q(qk2 qk2Var) {
        w(al6.l(qk2Var.h));
    }

    @Override
    public final void r(f34 f34Var) {
        w(al6.l("\n"));
    }

    @Override
    public final void s(bm5 bm5Var) {
        String str = bm5Var.h;
        if (str == null) {
            str = "";
        }
        String trim = str.trim();
        if (trim.startsWith("mailto:")) {
            TL_iv.RichText textemail = new TL_iv.textEmail();
            textemail.text = y(bm5Var);
            textemail.email = trim.substring(7);
            w(textemail);
        } else if (trim.startsWith("tel:")) {
            TL_iv.textPhone textphone = new TL_iv.textPhone();
            textphone.text = y(bm5Var);
            textphone.phone = trim.substring(4);
            w(textphone);
        } else {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = y(bm5Var);
            texturl.url = trim;
            w(texturl);
        }
    }

    @Override
    public final void t(f34 f34Var) {
        String str;
        if (this.b instanceof TL_iv.pageBlockBlockquote) {
            str = "\n";
        } else {
            str = " ";
        }
        w(al6.l(str));
    }

    @Override
    public final void u(f34 f34Var) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(f34Var);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.c.texts.add(richText);
    }

    public final TL_iv.RichText y(ui6 ui6Var) {
        TL_iv.textConcat textconcat = this.c;
        this.c = new TL_iv.textConcat();
        v(ui6Var);
        TL_iv.RichText x = x(this.c);
        this.c = textconcat;
        return x;
    }
}
