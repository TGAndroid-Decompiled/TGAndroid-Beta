package bi;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class p8 {
    public int f3477a;
    public String f3478b;
    public TLRPC.Photo f3479c;
    public TLRPC.Document d;

    public static p8 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f3477a = tL_storyAlbum.album_id;
        obj.f3478b = tL_storyAlbum.title;
        obj.f3479c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
