package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class r6 {
    public int f9701a;
    public String f9702b;
    public TLRPC.Photo f9703c;
    public TLRPC.Document d;

    public static r6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f9701a = tL_storyAlbum.album_id;
        obj.f9702b = tL_storyAlbum.title;
        obj.f9703c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
