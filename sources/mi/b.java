package mi;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class b implements AutoCloseable {
    public final PrismaHighlighter f15852a;

    public b(PrismaHighlighter prismaHighlighter) {
        this.f15852a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f15852a.close();
    }
}
