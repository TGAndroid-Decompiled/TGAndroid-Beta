package df;

import e5.u;
import java.util.regex.Pattern;
public final class j extends jf.a {
    public static final Pattern[][] f8881e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern f8883b;
    public final gf.j f8882a = new gf.p();
    public boolean f8884c = false;
    public u d = new u(5, (short) 0);

    public j(Pattern pattern) {
        this.f8883b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        u uVar = this.d;
        StringBuilder sb2 = (StringBuilder) uVar.f9634c;
        if (uVar.f9633b != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        uVar.f9633b++;
        Pattern pattern = this.f8883b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f8884c = true;
        }
    }

    @Override
    public final void d() {
        this.f8882a.f12259g = ((StringBuilder) this.d.f9634c).toString();
        this.d = null;
    }

    @Override
    public final gf.a e() {
        return this.f8882a;
    }

    @Override
    public final a h(g gVar) {
        if (!this.f8884c) {
            if (gVar.h && this.f8883b == null) {
                return null;
            }
            return a.a(gVar.f8863b);
        }
        return null;
    }
}
