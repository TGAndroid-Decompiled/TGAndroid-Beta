package fe;

import java.util.regex.Pattern;
import n2.w;
public final class h extends ke.a {
    public static final Pattern[][] f6081e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern f6083b;
    public final ie.j f6082a = new ie.p();
    public boolean f6084c = false;
    public w d = new w(6, (byte) 0);

    public h(Pattern pattern) {
        this.f6083b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        w wVar = this.d;
        StringBuilder sb2 = (StringBuilder) wVar.f18361c;
        if (wVar.f18360b != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        wVar.f18360b++;
        Pattern pattern = this.f6083b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f6084c = true;
        }
    }

    @Override
    public final void d() {
        this.f6082a.f11115g = ((StringBuilder) this.d.f18361c).toString();
        this.d = null;
    }

    @Override
    public final ie.a e() {
        return this.f6082a;
    }

    @Override
    public final e4.h h(e eVar) {
        if (!this.f6084c) {
            if (eVar.h && this.f6083b == null) {
                return null;
            }
            return e4.h.a(eVar.f6063b);
        }
        return null;
    }
}
