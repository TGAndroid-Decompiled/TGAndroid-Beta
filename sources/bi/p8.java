package bi;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class p8 {
    public int f3473a;
    public String f3474b;
    public TLRPC.Photo f3475c;
    public TLRPC.Document d;

    public static p8 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f3473a = tL_storyAlbum.album_id;
        obj.f3474b = tL_storyAlbum.title;
        obj.f3475c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
