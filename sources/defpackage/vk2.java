package defpackage;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class vk2 implements AutoCloseable {
    public final PrismaHighlighter a;

    public vk2(PrismaHighlighter prismaHighlighter) {
        this.a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.a.close();
    }
}
