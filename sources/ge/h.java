package ge;

import java.util.regex.Pattern;
import n2.v;

public final class h extends le.a {

    public static final Pattern[][] f6881e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    public final Pattern f6883b;

    public final je.j f6882a = new je.j();

    public boolean f6884c = false;
    public v d = new v(7, (byte) 0);

    public h(Pattern pattern) {
        this.f6883b = pattern;
    }

    @Override
    public final void a(CharSequence charSequence) {
        v vVar = this.d;
        StringBuilder sb2 = (StringBuilder) vVar.f18187c;
        if (vVar.f18186b != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        vVar.f18186b++;
        Pattern pattern = this.f6883b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f6884c = true;
    }

    @Override
    public final void d() {
        this.f6882a.f12917g = ((StringBuilder) this.d.f18187c).toString();
        this.d = null;
    }

    @Override
    public final je.a e() {
        return this.f6882a;
    }

    @Override
    public final e4.h h(e eVar) {
        if (this.f6884c) {
            return null;
        }
        if (eVar.h && this.f6883b == null) {
            return null;
        }
        return e4.h.a(eVar.f6863b);
    }
}
