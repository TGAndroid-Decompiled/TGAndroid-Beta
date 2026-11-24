package defpackage;

import org.telegram.tgnet.tl.TL_stories;
public final class o0c implements zw5, yw5 {
    public final b1c a;
    public final TL_stories.StoryItem b;
    public final z0c c;

    public o0c(b1c b1cVar, TL_stories.StoryItem storyItem, z0c z0cVar) {
        this.a = b1cVar;
        this.b = storyItem;
        this.c = z0cVar;
    }

    @Override
    public final void a(String str) {
        gl.d3(new exa(this.a, this.b, str, this.c, (byte) 16));
    }

    @Override
    public final void n(Exception exc) {
        gl.d3(new r1b(this.a, this.b, this.c, (byte) 20));
    }
}
