package af;

import c5.b0;
import java.util.regex.Pattern;
public final class k extends ff.a {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern f590b;
    public final df.j f589a = new df.p();
    public boolean f591c = false;
    public b0 d = new b0(1, (short) 0);

    public k(Pattern pattern) {
        this.f590b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        b0 b0Var = this.d;
        StringBuilder sb2 = (StringBuilder) b0Var.f4703c;
        if (b0Var.f4702b != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        b0Var.f4702b++;
        Pattern pattern = this.f590b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f591c = true;
        }
    }

    @Override
    public final void d() {
        this.f589a.f7979g = ((StringBuilder) this.d.f4703c).toString();
        this.d = null;
    }

    @Override
    public final df.a e() {
        return this.f589a;
    }

    @Override
    public final a h(h hVar) {
        if (!this.f591c) {
            if (hVar.h && this.f590b == null) {
                return null;
            }
            return a.a(hVar.f572b);
        }
        return null;
    }
}
