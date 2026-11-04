package oi;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class b implements AutoCloseable {
    public final PrismaHighlighter f21133a;

    public b(PrismaHighlighter prismaHighlighter) {
        this.f21133a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f21133a.close();
    }
}
