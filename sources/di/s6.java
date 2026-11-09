package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class s6 {
    public int f9732a;
    public String f9733b;
    public TLRPC.Photo f9734c;
    public TLRPC.Document d;

    public static s6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f9732a = tL_storyAlbum.album_id;
        obj.f9733b = tL_storyAlbum.title;
        obj.f9734c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
