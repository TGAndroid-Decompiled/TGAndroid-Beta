package nh;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class m6 {
    public int f15618a;
    public String f15619b;
    public TLRPC.Photo f15620c;
    public TLRPC.Document d;

    public static m6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f15618a = tL_storyAlbum.album_id;
        obj.f15619b = tL_storyAlbum.title;
        obj.f15620c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
