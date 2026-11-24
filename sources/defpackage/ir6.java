package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class ir6 extends b4 {
    public static final vk9 e;
    public final ArrayList a;
    public final Bundle b;
    public int c;
    public static final String[] d = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<ir6> CREATOR = new igd((byte) 11);

    static {
        vk9 vk9Var = new vk9((byte) 27);
        vk9Var.A(4, "com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime");
        vk9Var.A(4, "com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate");
        vk9Var.A(4, "com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate");
        vk9Var.A(1, "com.google.android.gms.cast.metadata.TITLE", "title");
        vk9Var.A(1, "com.google.android.gms.cast.metadata.SUBTITLE", "subtitle");
        vk9Var.A(1, "com.google.android.gms.cast.metadata.ARTIST", "artist");
        vk9Var.A(1, "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist");
        vk9Var.A(1, "com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName");
        vk9Var.A(1, "com.google.android.gms.cast.metadata.COMPOSER", "composer");
        vk9Var.A(2, "com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber");
        vk9Var.A(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber");
        vk9Var.A(2, "com.google.android.gms.cast.metadata.SEASON_NUMBER", "season");
        vk9Var.A(2, "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode");
        vk9Var.A(1, "com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle");
        vk9Var.A(1, "com.google.android.gms.cast.metadata.STUDIO", "studio");
        vk9Var.A(2, "com.google.android.gms.cast.metadata.WIDTH", "width");
        vk9Var.A(2, "com.google.android.gms.cast.metadata.HEIGHT", "height");
        vk9Var.A(1, "com.google.android.gms.cast.metadata.LOCATION_NAME", "location");
        vk9Var.A(3, "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude");
        vk9Var.A(3, "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude");
        vk9Var.A(5, "com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration");
        vk9Var.A(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia");
        vk9Var.A(5, "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime");
        vk9Var.A(5, "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer");
        vk9Var.A(2, "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId");
        vk9Var.A(1, "com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle");
        vk9Var.A(2, "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber");
        vk9Var.A(1, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle");
        e = vk9Var;
    }

    public ir6(int i) {
        this(new ArrayList(), new Bundle(), i);
    }

    public static void c(int i, String str) {
        int i2;
        if (!TextUtils.isEmpty(str)) {
            Integer num = (Integer) ((HashMap) e.d).get(str);
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            if (i2 != i && i2 != 0) {
                w26.j(tb4.q("Value for ", str, " must be a ", d[i]));
                return;
            }
            return;
        }
        w26.j("null and empty keys are not allowed");
    }

    public static boolean f(Bundle bundle, Bundle bundle2) {
        if (bundle.size() == bundle2.size()) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (!(obj instanceof Bundle) || !(obj2 instanceof Bundle) || f((Bundle) obj, (Bundle) obj2)) {
                    if (obj == null) {
                        if (obj2 != null || !bundle2.containsKey(str)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final void b(String str, String str2) {
        c(1, str);
        this.b.putString(str, str2);
    }

    public final JSONObject d() {
        Bundle bundle;
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.c);
        } catch (JSONException unused) {
        }
        JSONArray b = b5d.b(this.a);
        if (b.length() != 0) {
            try {
                jSONObject.put("images", b);
            } catch (JSONException unused2) {
            }
        }
        ArrayList arrayList = new ArrayList();
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
                            }
                        } else {
                            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                        }
                    } else {
                        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                    }
                } else {
                    Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                }
            } else {
                Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
            }
        } else {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                bundle = this.b;
                if (i3 >= size) {
                    break;
                }
                Object obj = arrayList.get(i3);
                i3++;
                String str = (String) obj;
                if (str != null && bundle.containsKey(str)) {
                    vk9 vk9Var = e;
                    String str2 = (String) ((HashMap) vk9Var.b).get(str);
                    if (str2 != null) {
                        Integer num = (Integer) ((HashMap) vk9Var.d).get(str);
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (i == 5) {
                                            long j = bundle.getLong(str);
                                            Pattern pattern = id1.a;
                                            jSONObject.put(str2, j / 1000.0d);
                                        }
                                    }
                                } else {
                                    jSONObject.put(str2, bundle.getDouble(str));
                                }
                            } else {
                                jSONObject.put(str2, bundle.getInt(str));
                            }
                        }
                        jSONObject.put(str2, bundle.getString(str));
                    }
                }
            }
            for (String str3 : bundle.keySet()) {
                if (!str3.startsWith("com.google.")) {
                    Object obj2 = bundle.get(str3);
                    if (obj2 instanceof String) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Integer) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Double) {
                        jSONObject.put(str3, obj2);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public final void e(JSONObject jSONObject) {
        int i;
        Bundle bundle = this.b;
        bundle.clear();
        ArrayList arrayList = this.a;
        arrayList.clear();
        this.c = 0;
        try {
            this.c = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            b5d.c(arrayList, optJSONArray);
        }
        ArrayList arrayList2 = new ArrayList();
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
                            }
                        } else {
                            Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
                        }
                    } else {
                        Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
                    }
                } else {
                    Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
                }
            } else {
                Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
            }
        } else {
            Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        }
        Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList2);
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !"metadataType".equals(next)) {
                    vk9 vk9Var = e;
                    String str = (String) ((HashMap) vk9Var.c).get(next);
                    if (str != null) {
                        if (hashSet.contains(str)) {
                            try {
                                Object obj = jSONObject.get(next);
                                if (obj != null) {
                                    Integer num = (Integer) ((HashMap) vk9Var.d).get(str);
                                    if (num != null) {
                                        i = num.intValue();
                                    } else {
                                        i = 0;
                                    }
                                    if (i != 1) {
                                        if (i != 2) {
                                            if (i != 3) {
                                                if (i != 4) {
                                                    if (i == 5) {
                                                        long optLong = jSONObject.optLong(next);
                                                        Pattern pattern = id1.a;
                                                        bundle.putLong(str, optLong * 1000);
                                                    }
                                                } else if (obj instanceof String) {
                                                    String str2 = (String) obj;
                                                    if (b5d.a(str2) != null) {
                                                        bundle.putString(str, str2);
                                                    }
                                                }
                                            } else {
                                                double optDouble = jSONObject.optDouble(next);
                                                if (!Double.isNaN(optDouble)) {
                                                    bundle.putDouble(str, optDouble);
                                                }
                                            }
                                        } else if (obj instanceof Integer) {
                                            bundle.putInt(str, ((Integer) obj).intValue());
                                        }
                                    } else if (obj instanceof String) {
                                        bundle.putString(str, (String) obj);
                                    }
                                }
                            } catch (JSONException unused2) {
                            }
                        }
                    } else {
                        Object obj2 = jSONObject.get(next);
                        if (obj2 instanceof String) {
                            bundle.putString(next, (String) obj2);
                        } else if (obj2 instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj2).intValue());
                        } else if (obj2 instanceof Double) {
                            bundle.putDouble(next, ((Double) obj2).doubleValue());
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ir6) {
                ir6 ir6Var = (ir6) obj;
                if (f(this.b, ir6Var.b) && this.a.equals(ir6Var.a)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = 17;
        Bundle bundle = this.b;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                int i3 = i2 * 31;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                i2 = i3 + i;
            }
        }
        return this.a.hashCode() + (i2 * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.p(parcel, 2, this.a);
        jte.b(parcel, 3, this.b);
        int i2 = this.c;
        jte.q(parcel, 4, 4);
        parcel.writeInt(i2);
        jte.s(parcel, r);
    }

    public ir6(ArrayList arrayList, Bundle bundle, int i) {
        this.a = arrayList;
        this.b = bundle;
        this.c = i;
    }
}
