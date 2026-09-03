package ke;

import java.util.regex.Pattern;
import p2.v;
public final class h extends pe.a {
    public static final Pattern[][] f11138e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern f11140b;
    public final ne.j f11139a = new ne.p();
    public boolean f11141c = false;
    public v d = new v(8, (byte) 0);

    public h(Pattern pattern) {
        this.f11140b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        v vVar = this.d;
        StringBuilder sb = (StringBuilder) vVar.f44214c;
        if (vVar.f44213b != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        vVar.f44213b++;
        Pattern pattern = this.f11140b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f11141c = true;
        }
    }

    @Override
    public final void d() {
        this.f11139a.f15969g = ((StringBuilder) this.d.f44214c).toString();
        this.d = null;
    }

    @Override
    public final ne.a e() {
        return this.f11139a;
    }

    @Override
    public final j4.h h(e eVar) {
        if (!this.f11141c) {
            if (eVar.h && this.f11140b == null) {
                return null;
            }
            return j4.h.a(eVar.f11120b);
        }
        return null;
    }
}
