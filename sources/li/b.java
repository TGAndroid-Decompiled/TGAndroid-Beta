package li;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class b implements AutoCloseable {
    public final PrismaHighlighter f15607a;

    public b(PrismaHighlighter prismaHighlighter) {
        this.f15607a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f15607a.close();
    }
}
