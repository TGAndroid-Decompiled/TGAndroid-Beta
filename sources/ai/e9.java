package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class e9 {
    public int f922a;
    public String f923b;
    public TLRPC.Photo f924c;
    public TLRPC.Document d;

    public static e9 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f922a = tL_storyAlbum.album_id;
        obj.f923b = tL_storyAlbum.title;
        obj.f924c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
