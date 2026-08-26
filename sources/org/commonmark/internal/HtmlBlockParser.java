package org.commonmark.internal;

import com.android.billingclient.api.zzbv;
import java.util.regex.Pattern;
import org.commonmark.node.Block;
import org.commonmark.node.HtmlBlock;
import org.commonmark.parser.block.AbstractBlockParser;

public final class HtmlBlockParser extends AbstractBlockParser {
    public static final Pattern[][] BLOCK_PATTERNS = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern closingPattern;
    public final HtmlBlock block = new HtmlBlock();
    public boolean finished = false;
    public zzbv content = new zzbv(11, (byte) 0);

    public HtmlBlockParser(Pattern pattern) {
        this.closingPattern = pattern;
    }

    @Override
    public final void addLine(CharSequence charSequence) {
        zzbv zzbvVar = this.content;
        int i = zzbvVar.zzb;
        StringBuilder sb = (StringBuilder) zzbvVar.zza;
        if (i != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        zzbvVar.zzb++;
        Pattern pattern = this.closingPattern;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.finished = true;
    }

    @Override
    public final void closeBlock() {
        this.block.literal = ((StringBuilder) this.content.zza).toString();
        this.content = null;
    }

    @Override
    public final Block getBlock() {
        return this.block;
    }

    @Override
    public final BlockContinueImpl tryContinue(DocumentParser documentParser) {
        if (this.finished) {
            return null;
        }
        if (documentParser.blank && this.closingPattern == null) {
            return null;
        }
        return BlockContinueImpl.atIndex(documentParser.index);
    }
}
