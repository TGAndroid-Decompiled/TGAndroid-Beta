package e2;

import a8.wb;
import a8.yb;
import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public abstract class h {
    public static final Pattern f9664a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern f9665b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern f9666c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final HashMap d;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        c3.h0.o(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        hashMap.put("aqua", -16711681);
        hashMap.put("aquamarine", -8388652);
        c3.h0.o(-983041, hashMap, "azure", -657956, "beige");
        c3.h0.o(-6972, hashMap, "bisque", -16777216, "black");
        c3.h0.o(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        c3.h0.o(-7722014, hashMap, "blueviolet", -5952982, "brown");
        c3.h0.o(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        c3.h0.o(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        c3.h0.o(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        c3.h0.o(-1828, hashMap, "cornsilk", -2354116, "crimson");
        hashMap.put("cyan", -16711681);
        hashMap.put("darkblue", -16777077);
        c3.h0.o(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        hashMap.put("darkgray", -5658199);
        hashMap.put("darkgreen", -16751616);
        hashMap.put("darkgrey", -5658199);
        hashMap.put("darkkhaki", -4343957);
        c3.h0.o(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        c3.h0.o(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        c3.h0.o(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        c3.h0.o(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        hashMap.put("darkturquoise", -16724271);
        hashMap.put("darkviolet", -7077677);
        c3.h0.o(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        hashMap.put("dodgerblue", -14774017);
        hashMap.put("firebrick", -5103070);
        c3.h0.o(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        hashMap.put("fuchsia", -65281);
        hashMap.put("gainsboro", -2302756);
        c3.h0.o(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        c3.h0.o(-16744448, hashMap, "green", -5374161, "greenyellow");
        hashMap.put("grey", -8355712);
        hashMap.put("honeydew", -983056);
        c3.h0.o(-38476, hashMap, "hotpink", -3318692, "indianred");
        c3.h0.o(-11861886, hashMap, "indigo", -16, "ivory");
        c3.h0.o(-989556, hashMap, "khaki", -1644806, "lavender");
        c3.h0.o(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        c3.h0.o(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        c3.h0.o(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        c3.h0.o(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        c3.h0.o(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        hashMap.put("lightsteelblue", -5192482);
        hashMap.put("lightyellow", -32);
        c3.h0.o(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        c3.h0.o(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        c3.h0.o(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        c3.h0.o(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        c3.h0.o(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        c3.h0.o(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        c3.h0.o(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        c3.h0.o(-6943, hashMap, "mistyrose", -6987, "moccasin");
        c3.h0.o(-8531, hashMap, "navajowhite", -16777088, "navy");
        c3.h0.o(-133658, hashMap, "oldlace", -8355840, "olive");
        c3.h0.o(-9728477, hashMap, "olivedrab", -23296, "orange");
        c3.h0.o(-47872, hashMap, "orangered", -2461482, "orchid");
        c3.h0.o(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        c3.h0.o(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        c3.h0.o(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        c3.h0.o(-3308225, hashMap, "peru", -16181, "pink");
        c3.h0.o(-2252579, hashMap, "plum", -5185306, "powderblue");
        c3.h0.o(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        c3.h0.o(-65536, hashMap, "red", -4419697, "rosybrown");
        c3.h0.o(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        c3.h0.o(-360334, hashMap, "salmon", -744352, "sandybrown");
        c3.h0.o(-13726889, hashMap, "seagreen", -2578, "seashell");
        c3.h0.o(-6270419, hashMap, "sienna", -4144960, "silver");
        c3.h0.o(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        hashMap.put("snow", -1286);
        hashMap.put("springgreen", -16711809);
        c3.h0.o(-12156236, hashMap, "steelblue", -2968436, "tan");
        c3.h0.o(-16744320, hashMap, "teal", -2572328, "thistle");
        c3.h0.o(-40121, hashMap, "tomato", 0, "transparent");
        c3.h0.o(-12525360, hashMap, "turquoise", -1146130, "violet");
        c3.h0.o(-663885, hashMap, "wheat", -1, "white");
        c3.h0.o(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z10) {
        Pattern pattern;
        int parseInt;
        yb.g(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            if (z10) {
                pattern = f9666c;
            } else {
                pattern = f9665b;
            }
            Matcher matcher = pattern.matcher(replace);
            if (matcher.matches()) {
                if (z10) {
                    String group = matcher.group(4);
                    group.getClass();
                    parseInt = (int) (Float.parseFloat(group) * 255.0f);
                } else {
                    String group2 = matcher.group(4);
                    group2.getClass();
                    parseInt = Integer.parseInt(group2, 10);
                }
                String group3 = matcher.group(1);
                group3.getClass();
                int parseInt2 = Integer.parseInt(group3, 10);
                String group4 = matcher.group(2);
                group4.getClass();
                int parseInt3 = Integer.parseInt(group4, 10);
                String group5 = matcher.group(3);
                group5.getClass();
                return Color.argb(parseInt, parseInt2, parseInt3, Integer.parseInt(group5, 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f9664a.matcher(replace);
            if (matcher2.matches()) {
                String group6 = matcher2.group(1);
                group6.getClass();
                int parseInt4 = Integer.parseInt(group6, 10);
                String group7 = matcher2.group(2);
                group7.getClass();
                int parseInt5 = Integer.parseInt(group7, 10);
                String group8 = matcher2.group(3);
                group8.getClass();
                return Color.rgb(parseInt4, parseInt5, Integer.parseInt(group8, 10));
            }
        } else {
            Integer num = (Integer) d.get(wb.c(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
