package defpackage;

import org.telegram.tgnet.tl.TL_stories;
public final class o2c implements zy5, yy5 {
    public final b3c a;
    public final TL_stories.StoryItem b;
    public final z2c c;

    public o2c(b3c b3cVar, TL_stories.StoryItem storyItem, z2c z2cVar) {
        this.a = b3cVar;
        this.b = storyItem;
        this.c = z2cVar;
    }

    @Override
    public final void a(String str) {
        gm.c3(new hza(this.a, this.b, str, this.c, (byte) 16));
    }

    @Override
    public final void o(Exception exc) {
        gm.c3(new j2b(this.a, this.b, this.c, (byte) 23));
    }
}
