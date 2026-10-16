package li;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class b implements AutoCloseable {
    public final PrismaHighlighter f14745a;

    public b(PrismaHighlighter prismaHighlighter) {
        this.f14745a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f14745a.close();
    }
}
