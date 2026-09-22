package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class e9 {
    public int f770a;
    public String f771b;
    public TLRPC.Photo f772c;
    public TLRPC.Document d;

    public static e9 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f770a = tL_storyAlbum.album_id;
        obj.f771b = tL_storyAlbum.title;
        obj.f772c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
