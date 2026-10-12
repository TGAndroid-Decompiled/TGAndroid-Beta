package ki;

import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class b implements AutoCloseable {
    public final PrismaHighlighter f14876a;

    public b(PrismaHighlighter prismaHighlighter) {
        this.f14876a = prismaHighlighter;
    }

    @Override
    public final void close() {
        this.f14876a.close();
    }
}
