package ke;

import java.util.regex.Pattern;
import p2.w;
public final class h extends pe.a {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern f10345b;
    public final ne.j f10344a = new ne.p();
    public boolean f10346c = false;
    public w d = new w(8, (byte) 0);

    public h(Pattern pattern) {
        this.f10345b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        w wVar = this.d;
        StringBuilder sb = (StringBuilder) wVar.f41052c;
        if (wVar.f41051b != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        wVar.f41051b++;
        Pattern pattern = this.f10345b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f10346c = true;
        }
    }

    @Override
    public final void d() {
        this.f10344a.f14933g = ((StringBuilder) this.d.f41052c).toString();
        this.d = null;
    }

    @Override
    public final ne.a e() {
        return this.f10344a;
    }

    @Override
    public final j4.h h(e eVar) {
        if (!this.f10346c) {
            if (eVar.h && this.f10345b == null) {
                return null;
            }
            return j4.h.a(eVar.f10327b);
        }
        return null;
    }
}
