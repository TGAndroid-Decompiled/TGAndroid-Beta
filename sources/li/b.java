package li;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class b implements AutoCloseable {
    public final PrismaHighlighter f15643a;

    public b(PrismaHighlighter prismaHighlighter) {
        this.f15643a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f15643a.close();
    }
}
