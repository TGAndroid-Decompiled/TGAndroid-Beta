package af;

import c5.c0;
import java.util.regex.Pattern;
public final class k extends ff.a {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern f586b;
    public final df.j f585a = new df.p();
    public boolean f587c = false;
    public c0 d = new c0(1, (short) 0);

    public k(Pattern pattern) {
        this.f586b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        c0 c0Var = this.d;
        StringBuilder sb2 = (StringBuilder) c0Var.f4353c;
        if (c0Var.f4352b != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        c0Var.f4352b++;
        Pattern pattern = this.f586b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f587c = true;
        }
    }

    @Override
    public final void d() {
        this.f585a.f6521g = ((StringBuilder) this.d.f4353c).toString();
        this.d = null;
    }

    @Override
    public final df.a e() {
        return this.f585a;
    }

    @Override
    public final a h(h hVar) {
        if (!this.f587c) {
            if (hVar.h && this.f586b == null) {
                return null;
            }
            return a.a(hVar.f568b);
        }
        return null;
    }
}
