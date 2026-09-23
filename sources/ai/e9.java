package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class e9 {
    public int f854a;
    public String f855b;
    public TLRPC.Photo f856c;
    public TLRPC.Document d;

    public static e9 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f854a = tL_storyAlbum.album_id;
        obj.f855b = tL_storyAlbum.title;
        obj.f856c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
