package ki;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class b implements AutoCloseable {
    public final PrismaHighlighter f14877a;

    public b(PrismaHighlighter prismaHighlighter) {
        this.f14877a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f14877a.close();
    }
}
