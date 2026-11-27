package defpackage;

import org.telegram.tgnet.tl.TL_stories;
public final class o4c implements ez5, dz5 {
    public final a5c a;
    public final TL_stories.StoryItem b;
    public final y4c c;

    public o4c(a5c a5cVar, TL_stories.StoryItem storyItem, y4c y4cVar) {
        this.a = a5cVar;
        this.b = storyItem;
        this.c = y4cVar;
    }

    @Override
    public final void a(String str) {
        hl.c3(new kta(this.a, this.b, str, this.c, (byte) 17));
    }

    @Override
    public final void l(Exception exc) {
        hl.c3(new pwa(this.a, this.b, this.c, (byte) 29));
    }
}
