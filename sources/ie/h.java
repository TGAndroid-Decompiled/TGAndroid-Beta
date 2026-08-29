package ie;

import java.util.regex.Pattern;
import p2.u;
public final class h extends ne.a {
    public static final Pattern[][] f8918e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern f8920b;
    public final le.j f8919a = new le.p();
    public boolean f8921c = false;
    public u d = new u(8, (byte) 0);

    public h(Pattern pattern) {
        this.f8920b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        u uVar = this.d;
        StringBuilder sb2 = (StringBuilder) uVar.f45495c;
        if (uVar.f45494b != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        uVar.f45494b++;
        Pattern pattern = this.f8920b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f8921c = true;
        }
    }

    @Override
    public final void d() {
        this.f8919a.f15198g = ((StringBuilder) this.d.f45495c).toString();
        this.d = null;
    }

    @Override
    public final le.a e() {
        return this.f8919a;
    }

    @Override
    public final g4.h h(e eVar) {
        if (!this.f8921c) {
            if (eVar.h && this.f8920b == null) {
                return null;
            }
            return g4.h.a(eVar.f8900b);
        }
        return null;
    }
}
