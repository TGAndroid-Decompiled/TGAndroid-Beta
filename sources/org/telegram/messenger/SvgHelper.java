package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class SvgHelper {
    private static final Pattern SPLIT_BOUNDARY;
    private static final double[] pow10 = new double[128];

    public static class Circle {
        float rad;

        float f19636x1;

        float f19637y1;

        public Circle(float f10, float f11, float f12) {
            this.f19636x1 = f10;
            this.f19637y1 = f11;
            this.rad = f12;
        }
    }

    public static class Line {

        float f19638x1;

        float f19639x2;

        float f19640y1;

        float f19641y2;

        public Line(float f10, float f11, float f12, float f13) {
            this.f19638x1 = f10;
            this.f19640y1 = f11;
            this.f19639x2 = f12;
            this.f19641y2 = f13;
        }
    }

    public static class NumberParse {
        private int nextCmd;
        private ArrayList<Float> numbers;

        public NumberParse(ArrayList<Float> arrayList, int i10) {
            this.numbers = arrayList;
            this.nextCmd = i10;
        }

        public int getNextCmd() {
            return this.nextCmd;
        }

        public float getNumber(int i10) {
            return this.numbers.get(i10).floatValue();
        }
    }

    public static class Oval {
        RectF rect;

        public Oval(RectF rectF) {
            this.rect = rectF;
        }
    }

    public static class ParserHelper {
        private char current;

        private int f19642n;
        public int pos;

        private CharSequence f19643s;

        public ParserHelper(CharSequence charSequence, int i10) {
            this.f19643s = charSequence;
            this.pos = i10;
            this.f19642n = charSequence.length();
            this.current = charSequence.charAt(i10);
        }

        private char read() {
            int i10 = this.pos;
            int i11 = this.f19642n;
            if (i10 < i11) {
                this.pos = i10 + 1;
            }
            int i12 = this.pos;
            if (i12 == i11) {
                return (char) 0;
            }
            return this.f19643s.charAt(i12);
        }

        private void reportUnexpectedCharacterError(char c10) {
            throw new RuntimeException("Unexpected char '" + c10 + "'.");
        }

        public void advance() {
            this.current = read();
        }

        public float buildFloat(int i10, int i11) {
            if (i11 < -125 || i10 == 0) {
                return 0.0f;
            }
            if (i11 >= 128) {
                return i10 > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
            }
            if (i11 == 0) {
                return i10;
            }
            if (i10 >= 67108864) {
                i10++;
            }
            double d = i10;
            double[] dArr = SvgHelper.pow10;
            return (float) (i11 > 0 ? d * dArr[i11] : d / dArr[-i11]);
        }

        public float nextFloat() {
            skipWhitespace();
            float f10 = parseFloat();
            skipNumberSeparator();
            return f10;
        }

        public float parseFloat() {
            boolean z10;
            int i10;
            int i11;
            int i12;
            boolean z11;
            char c10;
            char c11;
            char c12;
            char c13;
            int i13;
            char c14;
            char c15;
            char c16;
            char c17;
            char c18;
            char c19;
            char c20 = this.current;
            int i14 = 0;
            boolean z12 = true;
            if (c20 != '+') {
                if (c20 != '-') {
                    z10 = true;
                } else {
                    z10 = false;
                }
                switch (this.current) {
                    case '.':
                        i10 = 0;
                        i11 = 0;
                        i12 = 0;
                        z11 = false;
                        if (this.current == '.') {
                            c16 = read();
                            this.current = c16;
                            switch (c16) {
                                case '0':
                                    if (i10 == 0) {
                                        while (true) {
                                            c18 = read();
                                            this.current = c18;
                                            i11--;
                                            switch (c18) {
                                                case '0':
                                                    break;
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    break;
                                                default:
                                                    if (!z11) {
                                                        return 0.0f;
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    while (true) {
                                        if (i10 < 9) {
                                            i10++;
                                            i11--;
                                            i12 = (this.current - '0') + (i12 * 10);
                                        }
                                        c17 = read();
                                        this.current = c17;
                                        switch (c17) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    if (!z11) {
                                        reportUnexpectedCharacterError(c16);
                                        return 0.0f;
                                    }
                                    break;
                            }
                        }
                        c11 = this.current;
                        if (c11 != 'E' || c11 == 'e') {
                            c12 = read();
                            this.current = c12;
                            if (c12 == '+') {
                                c13 = read();
                                this.current = c13;
                                switch (c13) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c13);
                                        return 0.0f;
                                }
                            } else if (c12 != '-') {
                                switch (c12) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c12);
                                        return 0.0f;
                                }
                            } else {
                                z12 = false;
                                c13 = read();
                                this.current = c13;
                                switch (c13) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c13);
                                        return 0.0f;
                                }
                            }
                            switch (this.current) {
                                case '0':
                                    while (true) {
                                        c15 = read();
                                        this.current = c15;
                                        switch (c15) {
                                            case '0':
                                                break;
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                i13 = 0;
                                                while (true) {
                                                    if (i14 < 3) {
                                                        i14++;
                                                        i13 = (this.current - '0') + (i13 * 10);
                                                    }
                                                    c14 = read();
                                                    this.current = c14;
                                                    switch (c14) {
                                                        case '0':
                                                        case '1':
                                                        case '2':
                                                        case '3':
                                                        case '4':
                                                        case '5':
                                                        case '6':
                                                        case '7':
                                                        case '8':
                                                        case '9':
                                                            break;
                                                        default:
                                                            i14 = i13;
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    i13 = 0;
                                    while (true) {
                                        if (i14 < 3) {
                                            i14++;
                                            i13 = (this.current - '0') + (i13 * 10);
                                        }
                                        c14 = read();
                                        this.current = c14;
                                        switch (c14) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                i14 = i13;
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        if (!z12) {
                            i14 = -i14;
                        }
                        int i15 = i14 + i11;
                        if (!z10) {
                            i12 = -i12;
                        }
                        return buildFloat(i12, i15);
                    case '/':
                    default:
                        return Float.NaN;
                    case '0':
                        while (true) {
                            c19 = read();
                            this.current = c19;
                            if (c19 != '.' || c19 == 'E' || c19 == 'e') {
                                i10 = 0;
                                i11 = 0;
                                i12 = 0;
                                z11 = true;
                                if (this.current == '.') {
                                    c16 = read();
                                    this.current = c16;
                                    switch (c16) {
                                        case '0':
                                            if (i10 == 0) {
                                                while (true) {
                                                    c18 = read();
                                                    this.current = c18;
                                                    i11--;
                                                    switch (c18) {
                                                        case '0':
                                                            break;
                                                        case '1':
                                                        case '2':
                                                        case '3':
                                                        case '4':
                                                        case '5':
                                                        case '6':
                                                        case '7':
                                                        case '8':
                                                        case '9':
                                                            break;
                                                        default:
                                                            if (!z11) {
                                                                return 0.0f;
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            while (true) {
                                                if (i10 < 9) {
                                                    i10++;
                                                    i11--;
                                                    i12 = (this.current - '0') + (i12 * 10);
                                                }
                                                c17 = read();
                                                this.current = c17;
                                                switch (c17) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            if (!z11) {
                                                reportUnexpectedCharacterError(c16);
                                                return 0.0f;
                                            }
                                            break;
                                    }
                                }
                                c11 = this.current;
                                if (c11 != 'E') {
                                    c12 = read();
                                    this.current = c12;
                                    if (c12 == '+') {
                                        c13 = read();
                                        this.current = c13;
                                        switch (c13) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c13);
                                                return 0.0f;
                                        }
                                    } else if (c12 != '-') {
                                        switch (c12) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c12);
                                                return 0.0f;
                                        }
                                    } else {
                                        z12 = false;
                                        c13 = read();
                                        this.current = c13;
                                        switch (c13) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c13);
                                                return 0.0f;
                                        }
                                    }
                                    switch (this.current) {
                                        case '0':
                                            while (true) {
                                                c15 = read();
                                                this.current = c15;
                                                switch (c15) {
                                                    case '0':
                                                        break;
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        i13 = 0;
                                                        while (true) {
                                                            if (i14 < 3) {
                                                                i14++;
                                                                i13 = (this.current - '0') + (i13 * 10);
                                                            }
                                                            c14 = read();
                                                            this.current = c14;
                                                            switch (c14) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    break;
                                                                default:
                                                                    i14 = i13;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            i13 = 0;
                                            while (true) {
                                                if (i14 < 3) {
                                                    i14++;
                                                    i13 = (this.current - '0') + (i13 * 10);
                                                }
                                                c14 = read();
                                                this.current = c14;
                                                switch (c14) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                    default:
                                                        i14 = i13;
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    c12 = read();
                                    this.current = c12;
                                    if (c12 == '+') {
                                        c13 = read();
                                        this.current = c13;
                                        switch (c13) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c13);
                                                return 0.0f;
                                        }
                                    } else if (c12 != '-') {
                                        switch (c12) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c12);
                                                return 0.0f;
                                        }
                                    } else {
                                        z12 = false;
                                        c13 = read();
                                        this.current = c13;
                                        switch (c13) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c13);
                                                return 0.0f;
                                        }
                                    }
                                    switch (this.current) {
                                        case '0':
                                            while (true) {
                                                c15 = read();
                                                this.current = c15;
                                                switch (c15) {
                                                    case '0':
                                                        break;
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        i13 = 0;
                                                        while (true) {
                                                            if (i14 < 3) {
                                                                i14++;
                                                                i13 = (this.current - '0') + (i13 * 10);
                                                            }
                                                            c14 = read();
                                                            this.current = c14;
                                                            switch (c14) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    break;
                                                                default:
                                                                    i14 = i13;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            i13 = 0;
                                            while (true) {
                                                if (i14 < 3) {
                                                    i14++;
                                                    i13 = (this.current - '0') + (i13 * 10);
                                                }
                                                c14 = read();
                                                this.current = c14;
                                                switch (c14) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                    default:
                                                        i14 = i13;
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                if (!z12) {
                                    i14 = -i14;
                                }
                                int i16 = i14 + i11;
                                if (!z10) {
                                    i12 = -i12;
                                }
                                return buildFloat(i12, i16);
                            }
                            switch (c19) {
                                case '0':
                                    break;
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    return 0.0f;
                            }
                            i10 = 0;
                            i11 = 0;
                            i12 = 0;
                            while (true) {
                                if (i10 < 9) {
                                    i10++;
                                    i12 = (i12 * 10) + (this.current - '0');
                                } else {
                                    i11++;
                                }
                                c10 = read();
                                this.current = c10;
                                switch (c10) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                }
                                z11 = true;
                                if (this.current == '.') {
                                    c16 = read();
                                    this.current = c16;
                                    switch (c16) {
                                        case '0':
                                            if (i10 == 0) {
                                                while (true) {
                                                    c18 = read();
                                                    this.current = c18;
                                                    i11--;
                                                    switch (c18) {
                                                        case '0':
                                                            break;
                                                        case '1':
                                                        case '2':
                                                        case '3':
                                                        case '4':
                                                        case '5':
                                                        case '6':
                                                        case '7':
                                                        case '8':
                                                        case '9':
                                                            break;
                                                        default:
                                                            if (!z11) {
                                                                return 0.0f;
                                                            }
                                                            break;
                                                    }
                                                }
                                            }
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            while (true) {
                                                if (i10 < 9) {
                                                    i10++;
                                                    i11--;
                                                    i12 = (this.current - '0') + (i12 * 10);
                                                }
                                                c17 = read();
                                                this.current = c17;
                                                switch (c17) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                }
                                            }
                                            break;
                                        default:
                                            if (!z11) {
                                                reportUnexpectedCharacterError(c16);
                                                return 0.0f;
                                            }
                                            break;
                                    }
                                }
                                c11 = this.current;
                                if (c11 != 'E') {
                                    c12 = read();
                                    this.current = c12;
                                    if (c12 == '+') {
                                        c13 = read();
                                        this.current = c13;
                                        switch (c13) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c13);
                                                return 0.0f;
                                        }
                                    } else if (c12 != '-') {
                                        switch (c12) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c12);
                                                return 0.0f;
                                        }
                                    } else {
                                        z12 = false;
                                        c13 = read();
                                        this.current = c13;
                                        switch (c13) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c13);
                                                return 0.0f;
                                        }
                                    }
                                    switch (this.current) {
                                        case '0':
                                            while (true) {
                                                c15 = read();
                                                this.current = c15;
                                                switch (c15) {
                                                    case '0':
                                                        break;
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        i13 = 0;
                                                        while (true) {
                                                            if (i14 < 3) {
                                                                i14++;
                                                                i13 = (this.current - '0') + (i13 * 10);
                                                            }
                                                            c14 = read();
                                                            this.current = c14;
                                                            switch (c14) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    break;
                                                                default:
                                                                    i14 = i13;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            i13 = 0;
                                            while (true) {
                                                if (i14 < 3) {
                                                    i14++;
                                                    i13 = (this.current - '0') + (i13 * 10);
                                                }
                                                c14 = read();
                                                this.current = c14;
                                                switch (c14) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                    default:
                                                        i14 = i13;
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    c12 = read();
                                    this.current = c12;
                                    if (c12 == '+') {
                                        c13 = read();
                                        this.current = c13;
                                        switch (c13) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c13);
                                                return 0.0f;
                                        }
                                    } else if (c12 != '-') {
                                        switch (c12) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c12);
                                                return 0.0f;
                                        }
                                    } else {
                                        z12 = false;
                                        c13 = read();
                                        this.current = c13;
                                        switch (c13) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                reportUnexpectedCharacterError(c13);
                                                return 0.0f;
                                        }
                                    }
                                    switch (this.current) {
                                        case '0':
                                            while (true) {
                                                c15 = read();
                                                this.current = c15;
                                                switch (c15) {
                                                    case '0':
                                                        break;
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        i13 = 0;
                                                        while (true) {
                                                            if (i14 < 3) {
                                                                i14++;
                                                                i13 = (this.current - '0') + (i13 * 10);
                                                            }
                                                            c14 = read();
                                                            this.current = c14;
                                                            switch (c14) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    break;
                                                                default:
                                                                    i14 = i13;
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            break;
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            i13 = 0;
                                            while (true) {
                                                if (i14 < 3) {
                                                    i14++;
                                                    i13 = (this.current - '0') + (i13 * 10);
                                                }
                                                c14 = read();
                                                this.current = c14;
                                                switch (c14) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                    default:
                                                        i14 = i13;
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                if (!z12) {
                                    i14 = -i14;
                                }
                                int i17 = i14 + i11;
                                if (!z10) {
                                    i12 = -i12;
                                }
                                return buildFloat(i12, i17);
                            }
                        }
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        i10 = 0;
                        i11 = 0;
                        i12 = 0;
                        while (true) {
                            if (i10 < 9) {
                                i10++;
                                i12 = (i12 * 10) + (this.current - '0');
                            } else {
                                i11++;
                            }
                            c10 = read();
                            this.current = c10;
                            switch (c10) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                            }
                            z11 = true;
                            if (this.current == '.') {
                                c16 = read();
                                this.current = c16;
                                switch (c16) {
                                    case '0':
                                        if (i10 == 0) {
                                            while (true) {
                                                c18 = read();
                                                this.current = c18;
                                                i11--;
                                                switch (c18) {
                                                    case '0':
                                                        break;
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                    default:
                                                        if (!z11) {
                                                            return 0.0f;
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        while (true) {
                                            if (i10 < 9) {
                                                i10++;
                                                i11--;
                                                i12 = (this.current - '0') + (i12 * 10);
                                            }
                                            c17 = read();
                                            this.current = c17;
                                            switch (c17) {
                                                case '0':
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    break;
                                            }
                                        }
                                        break;
                                    default:
                                        if (!z11) {
                                            reportUnexpectedCharacterError(c16);
                                            return 0.0f;
                                        }
                                        break;
                                }
                            }
                            c11 = this.current;
                            if (c11 != 'E') {
                                c12 = read();
                                this.current = c12;
                                if (c12 == '+') {
                                    c13 = read();
                                    this.current = c13;
                                    switch (c13) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            reportUnexpectedCharacterError(c13);
                                            return 0.0f;
                                    }
                                } else if (c12 != '-') {
                                    switch (c12) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            reportUnexpectedCharacterError(c12);
                                            return 0.0f;
                                    }
                                } else {
                                    z12 = false;
                                    c13 = read();
                                    this.current = c13;
                                    switch (c13) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            reportUnexpectedCharacterError(c13);
                                            return 0.0f;
                                    }
                                }
                                switch (this.current) {
                                    case '0':
                                        while (true) {
                                            c15 = read();
                                            this.current = c15;
                                            switch (c15) {
                                                case '0':
                                                    break;
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    i13 = 0;
                                                    while (true) {
                                                        if (i14 < 3) {
                                                            i14++;
                                                            i13 = (this.current - '0') + (i13 * 10);
                                                        }
                                                        c14 = read();
                                                        this.current = c14;
                                                        switch (c14) {
                                                            case '0':
                                                            case '1':
                                                            case '2':
                                                            case '3':
                                                            case '4':
                                                            case '5':
                                                            case '6':
                                                            case '7':
                                                            case '8':
                                                            case '9':
                                                                break;
                                                            default:
                                                                i14 = i13;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        i13 = 0;
                                        while (true) {
                                            if (i14 < 3) {
                                                i14++;
                                                i13 = (this.current - '0') + (i13 * 10);
                                            }
                                            c14 = read();
                                            this.current = c14;
                                            switch (c14) {
                                                case '0':
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    break;
                                                default:
                                                    i14 = i13;
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                c12 = read();
                                this.current = c12;
                                if (c12 == '+') {
                                    c13 = read();
                                    this.current = c13;
                                    switch (c13) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            reportUnexpectedCharacterError(c13);
                                            return 0.0f;
                                    }
                                } else if (c12 != '-') {
                                    switch (c12) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            reportUnexpectedCharacterError(c12);
                                            return 0.0f;
                                    }
                                } else {
                                    z12 = false;
                                    c13 = read();
                                    this.current = c13;
                                    switch (c13) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            reportUnexpectedCharacterError(c13);
                                            return 0.0f;
                                    }
                                }
                                switch (this.current) {
                                    case '0':
                                        while (true) {
                                            c15 = read();
                                            this.current = c15;
                                            switch (c15) {
                                                case '0':
                                                    break;
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    i13 = 0;
                                                    while (true) {
                                                        if (i14 < 3) {
                                                            i14++;
                                                            i13 = (this.current - '0') + (i13 * 10);
                                                        }
                                                        c14 = read();
                                                        this.current = c14;
                                                        switch (c14) {
                                                            case '0':
                                                            case '1':
                                                            case '2':
                                                            case '3':
                                                            case '4':
                                                            case '5':
                                                            case '6':
                                                            case '7':
                                                            case '8':
                                                            case '9':
                                                                break;
                                                            default:
                                                                i14 = i13;
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        i13 = 0;
                                        while (true) {
                                            if (i14 < 3) {
                                                i14++;
                                                i13 = (this.current - '0') + (i13 * 10);
                                            }
                                            c14 = read();
                                            this.current = c14;
                                            switch (c14) {
                                                case '0':
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    break;
                                                default:
                                                    i14 = i13;
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            if (!z12) {
                                i14 = -i14;
                            }
                            int i18 = i14 + i11;
                            if (!z10) {
                                i12 = -i12;
                            }
                            return buildFloat(i12, i18);
                        }
                }
            }
            z10 = true;
            this.current = read();
            switch (this.current) {
                case '.':
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                    z11 = false;
                    if (this.current == '.') {
                        c16 = read();
                        this.current = c16;
                        switch (c16) {
                            case '0':
                                if (i10 == 0) {
                                    while (true) {
                                        c18 = read();
                                        this.current = c18;
                                        i11--;
                                        switch (c18) {
                                            case '0':
                                                break;
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                if (!z11) {
                                                    return 0.0f;
                                                }
                                                break;
                                        }
                                    }
                                }
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                while (true) {
                                    if (i10 < 9) {
                                        i10++;
                                        i11--;
                                        i12 = (this.current - '0') + (i12 * 10);
                                    }
                                    c17 = read();
                                    this.current = c17;
                                    switch (c17) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                    }
                                }
                                break;
                            default:
                                if (!z11) {
                                    reportUnexpectedCharacterError(c16);
                                    return 0.0f;
                                }
                                break;
                        }
                    }
                    c11 = this.current;
                    if (c11 != 'E') {
                        c12 = read();
                        this.current = c12;
                        if (c12 == '+') {
                            c13 = read();
                            this.current = c13;
                            switch (c13) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    reportUnexpectedCharacterError(c13);
                                    return 0.0f;
                            }
                        } else if (c12 != '-') {
                            switch (c12) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    reportUnexpectedCharacterError(c12);
                                    return 0.0f;
                            }
                        } else {
                            z12 = false;
                            c13 = read();
                            this.current = c13;
                            switch (c13) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    reportUnexpectedCharacterError(c13);
                                    return 0.0f;
                            }
                        }
                        switch (this.current) {
                            case '0':
                                while (true) {
                                    c15 = read();
                                    this.current = c15;
                                    switch (c15) {
                                        case '0':
                                            break;
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            i13 = 0;
                                            while (true) {
                                                if (i14 < 3) {
                                                    i14++;
                                                    i13 = (this.current - '0') + (i13 * 10);
                                                }
                                                c14 = read();
                                                this.current = c14;
                                                switch (c14) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                    default:
                                                        i14 = i13;
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                i13 = 0;
                                while (true) {
                                    if (i14 < 3) {
                                        i14++;
                                        i13 = (this.current - '0') + (i13 * 10);
                                    }
                                    c14 = read();
                                    this.current = c14;
                                    switch (c14) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            i14 = i13;
                                            break;
                                    }
                                }
                                break;
                        }
                    } else {
                        c12 = read();
                        this.current = c12;
                        if (c12 == '+') {
                            c13 = read();
                            this.current = c13;
                            switch (c13) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    reportUnexpectedCharacterError(c13);
                                    return 0.0f;
                            }
                        } else if (c12 != '-') {
                            switch (c12) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    reportUnexpectedCharacterError(c12);
                                    return 0.0f;
                            }
                        } else {
                            z12 = false;
                            c13 = read();
                            this.current = c13;
                            switch (c13) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    reportUnexpectedCharacterError(c13);
                                    return 0.0f;
                            }
                        }
                        switch (this.current) {
                            case '0':
                                while (true) {
                                    c15 = read();
                                    this.current = c15;
                                    switch (c15) {
                                        case '0':
                                            break;
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            i13 = 0;
                                            while (true) {
                                                if (i14 < 3) {
                                                    i14++;
                                                    i13 = (this.current - '0') + (i13 * 10);
                                                }
                                                c14 = read();
                                                this.current = c14;
                                                switch (c14) {
                                                    case '0':
                                                    case '1':
                                                    case '2':
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                    case '9':
                                                        break;
                                                    default:
                                                        i14 = i13;
                                                        break;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                i13 = 0;
                                while (true) {
                                    if (i14 < 3) {
                                        i14++;
                                        i13 = (this.current - '0') + (i13 * 10);
                                    }
                                    c14 = read();
                                    this.current = c14;
                                    switch (c14) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            break;
                                        default:
                                            i14 = i13;
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    if (!z12) {
                        i14 = -i14;
                    }
                    int i19 = i14 + i11;
                    if (!z10) {
                        i12 = -i12;
                    }
                    return buildFloat(i12, i19);
                case '/':
                default:
                    return Float.NaN;
                case '0':
                    while (true) {
                        c19 = read();
                        this.current = c19;
                        if (c19 != '.') {
                        }
                        i10 = 0;
                        i11 = 0;
                        i12 = 0;
                        z11 = true;
                        if (this.current == '.') {
                            c16 = read();
                            this.current = c16;
                            switch (c16) {
                                case '0':
                                    if (i10 == 0) {
                                        while (true) {
                                            c18 = read();
                                            this.current = c18;
                                            i11--;
                                            switch (c18) {
                                                case '0':
                                                    break;
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    break;
                                                default:
                                                    if (!z11) {
                                                        return 0.0f;
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    while (true) {
                                        if (i10 < 9) {
                                            i10++;
                                            i11--;
                                            i12 = (this.current - '0') + (i12 * 10);
                                        }
                                        c17 = read();
                                        this.current = c17;
                                        switch (c17) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    if (!z11) {
                                        reportUnexpectedCharacterError(c16);
                                        return 0.0f;
                                    }
                                    break;
                            }
                        }
                        c11 = this.current;
                        if (c11 != 'E') {
                            c12 = read();
                            this.current = c12;
                            if (c12 == '+') {
                                c13 = read();
                                this.current = c13;
                                switch (c13) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c13);
                                        return 0.0f;
                                }
                            } else if (c12 != '-') {
                                switch (c12) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c12);
                                        return 0.0f;
                                }
                            } else {
                                z12 = false;
                                c13 = read();
                                this.current = c13;
                                switch (c13) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c13);
                                        return 0.0f;
                                }
                            }
                            switch (this.current) {
                                case '0':
                                    while (true) {
                                        c15 = read();
                                        this.current = c15;
                                        switch (c15) {
                                            case '0':
                                                break;
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                i13 = 0;
                                                while (true) {
                                                    if (i14 < 3) {
                                                        i14++;
                                                        i13 = (this.current - '0') + (i13 * 10);
                                                    }
                                                    c14 = read();
                                                    this.current = c14;
                                                    switch (c14) {
                                                        case '0':
                                                        case '1':
                                                        case '2':
                                                        case '3':
                                                        case '4':
                                                        case '5':
                                                        case '6':
                                                        case '7':
                                                        case '8':
                                                        case '9':
                                                            break;
                                                        default:
                                                            i14 = i13;
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    i13 = 0;
                                    while (true) {
                                        if (i14 < 3) {
                                            i14++;
                                            i13 = (this.current - '0') + (i13 * 10);
                                        }
                                        c14 = read();
                                        this.current = c14;
                                        switch (c14) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                i14 = i13;
                                                break;
                                        }
                                    }
                                    break;
                            }
                        } else {
                            c12 = read();
                            this.current = c12;
                            if (c12 == '+') {
                                c13 = read();
                                this.current = c13;
                                switch (c13) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c13);
                                        return 0.0f;
                                }
                            } else if (c12 != '-') {
                                switch (c12) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c12);
                                        return 0.0f;
                                }
                            } else {
                                z12 = false;
                                c13 = read();
                                this.current = c13;
                                switch (c13) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c13);
                                        return 0.0f;
                                }
                            }
                            switch (this.current) {
                                case '0':
                                    while (true) {
                                        c15 = read();
                                        this.current = c15;
                                        switch (c15) {
                                            case '0':
                                                break;
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                i13 = 0;
                                                while (true) {
                                                    if (i14 < 3) {
                                                        i14++;
                                                        i13 = (this.current - '0') + (i13 * 10);
                                                    }
                                                    c14 = read();
                                                    this.current = c14;
                                                    switch (c14) {
                                                        case '0':
                                                        case '1':
                                                        case '2':
                                                        case '3':
                                                        case '4':
                                                        case '5':
                                                        case '6':
                                                        case '7':
                                                        case '8':
                                                        case '9':
                                                            break;
                                                        default:
                                                            i14 = i13;
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    i13 = 0;
                                    while (true) {
                                        if (i14 < 3) {
                                            i14++;
                                            i13 = (this.current - '0') + (i13 * 10);
                                        }
                                        c14 = read();
                                        this.current = c14;
                                        switch (c14) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                i14 = i13;
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        if (!z12) {
                            i14 = -i14;
                        }
                        int i110 = i14 + i11;
                        if (!z10) {
                            i12 = -i12;
                        }
                        return buildFloat(i12, i110);
                    }
                    break;
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                    while (true) {
                        if (i10 < 9) {
                            i10++;
                            i12 = (i12 * 10) + (this.current - '0');
                        } else {
                            i11++;
                        }
                        c10 = read();
                        this.current = c10;
                        switch (c10) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                break;
                        }
                        z11 = true;
                        if (this.current == '.') {
                            c16 = read();
                            this.current = c16;
                            switch (c16) {
                                case '0':
                                    if (i10 == 0) {
                                        while (true) {
                                            c18 = read();
                                            this.current = c18;
                                            i11--;
                                            switch (c18) {
                                                case '0':
                                                    break;
                                                case '1':
                                                case '2':
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    break;
                                                default:
                                                    if (!z11) {
                                                        return 0.0f;
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    while (true) {
                                        if (i10 < 9) {
                                            i10++;
                                            i11--;
                                            i12 = (this.current - '0') + (i12 * 10);
                                        }
                                        c17 = read();
                                        this.current = c17;
                                        switch (c17) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    if (!z11) {
                                        reportUnexpectedCharacterError(c16);
                                        return 0.0f;
                                    }
                                    break;
                            }
                        }
                        c11 = this.current;
                        if (c11 != 'E') {
                            c12 = read();
                            this.current = c12;
                            if (c12 == '+') {
                                c13 = read();
                                this.current = c13;
                                switch (c13) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c13);
                                        return 0.0f;
                                }
                            } else if (c12 != '-') {
                                switch (c12) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c12);
                                        return 0.0f;
                                }
                            } else {
                                z12 = false;
                                c13 = read();
                                this.current = c13;
                                switch (c13) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c13);
                                        return 0.0f;
                                }
                            }
                            switch (this.current) {
                                case '0':
                                    while (true) {
                                        c15 = read();
                                        this.current = c15;
                                        switch (c15) {
                                            case '0':
                                                break;
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                i13 = 0;
                                                while (true) {
                                                    if (i14 < 3) {
                                                        i14++;
                                                        i13 = (this.current - '0') + (i13 * 10);
                                                    }
                                                    c14 = read();
                                                    this.current = c14;
                                                    switch (c14) {
                                                        case '0':
                                                        case '1':
                                                        case '2':
                                                        case '3':
                                                        case '4':
                                                        case '5':
                                                        case '6':
                                                        case '7':
                                                        case '8':
                                                        case '9':
                                                            break;
                                                        default:
                                                            i14 = i13;
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    i13 = 0;
                                    while (true) {
                                        if (i14 < 3) {
                                            i14++;
                                            i13 = (this.current - '0') + (i13 * 10);
                                        }
                                        c14 = read();
                                        this.current = c14;
                                        switch (c14) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                i14 = i13;
                                                break;
                                        }
                                    }
                                    break;
                            }
                        } else {
                            c12 = read();
                            this.current = c12;
                            if (c12 == '+') {
                                c13 = read();
                                this.current = c13;
                                switch (c13) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c13);
                                        return 0.0f;
                                }
                            } else if (c12 != '-') {
                                switch (c12) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c12);
                                        return 0.0f;
                                }
                            } else {
                                z12 = false;
                                c13 = read();
                                this.current = c13;
                                switch (c13) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        reportUnexpectedCharacterError(c13);
                                        return 0.0f;
                                }
                            }
                            switch (this.current) {
                                case '0':
                                    while (true) {
                                        c15 = read();
                                        this.current = c15;
                                        switch (c15) {
                                            case '0':
                                                break;
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                i13 = 0;
                                                while (true) {
                                                    if (i14 < 3) {
                                                        i14++;
                                                        i13 = (this.current - '0') + (i13 * 10);
                                                    }
                                                    c14 = read();
                                                    this.current = c14;
                                                    switch (c14) {
                                                        case '0':
                                                        case '1':
                                                        case '2':
                                                        case '3':
                                                        case '4':
                                                        case '5':
                                                        case '6':
                                                        case '7':
                                                        case '8':
                                                        case '9':
                                                            break;
                                                        default:
                                                            i14 = i13;
                                                            break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    i13 = 0;
                                    while (true) {
                                        if (i14 < 3) {
                                            i14++;
                                            i13 = (this.current - '0') + (i13 * 10);
                                        }
                                        c14 = read();
                                        this.current = c14;
                                        switch (c14) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                break;
                                            default:
                                                i14 = i13;
                                                break;
                                        }
                                    }
                                    break;
                            }
                        }
                        if (!z12) {
                            i14 = -i14;
                        }
                        int i111 = i14 + i11;
                        if (!z10) {
                            i12 = -i12;
                        }
                        return buildFloat(i12, i111);
                    }
            }
        }

        public void skipNumberSeparator() {
            while (true) {
                int i10 = this.pos;
                if (i10 >= this.f19642n) {
                    return;
                }
                char cCharAt = this.f19643s.charAt(i10);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != ' ' && cCharAt != ',') {
                    return;
                } else {
                    advance();
                }
            }
        }

        public void skipWhitespace() {
            while (true) {
                int i10 = this.pos;
                if (i10 >= this.f19642n || !Character.isWhitespace(this.f19643s.charAt(i10))) {
                    return;
                } else {
                    advance();
                }
            }
        }
    }

    public static class Properties {
        Attributes atts;
        ArrayList<StyleSet> styles;

        public String getAttr(String str) {
            ArrayList<StyleSet> arrayList = this.styles;
            String style = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = this.styles.size();
                for (int i10 = 0; i10 < size; i10++) {
                    style = this.styles.get(i10).getStyle(str);
                    if (style != null) {
                        break;
                    }
                }
            }
            return style == null ? SvgHelper.getStringAttr(str, this.atts) : style;
        }

        public Float getFloat(String str, float f10) {
            Float f11 = getFloat(str);
            return f11 == null ? Float.valueOf(f10) : f11;
        }

        public Integer getHex(String str) {
            String attr = getAttr(str);
            if (attr == null) {
                return null;
            }
            try {
                return Integer.valueOf(Integer.parseInt(attr.substring(1), 16));
            } catch (NumberFormatException unused) {
                return SvgHelper.getColorByName(attr);
            }
        }

        public String getString(String str) {
            return getAttr(str);
        }

        private Properties(Attributes attributes, HashMap<String, StyleSet> map) {
            this.atts = attributes;
            String stringAttr = SvgHelper.getStringAttr("style", attributes);
            if (stringAttr != null) {
                ArrayList<StyleSet> arrayList = new ArrayList<>();
                this.styles = arrayList;
                arrayList.add(new StyleSet(stringAttr));
                return;
            }
            String stringAttr2 = SvgHelper.getStringAttr("class", attributes);
            if (stringAttr2 != null) {
                this.styles = new ArrayList<>();
                for (String str : stringAttr2.split(" ")) {
                    StyleSet styleSet = map.get(str.trim());
                    if (styleSet != null) {
                        this.styles.add(styleSet);
                    }
                }
            }
        }

        public Float getFloat(String str) {
            String attr = getAttr(str);
            if (attr == null) {
                return null;
            }
            try {
                return Float.valueOf(Float.parseFloat(attr));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
    }

    public static class RoundRect {
        RectF rect;
        float rx;

        public RoundRect(RectF rectF, float f10) {
            this.rect = rectF;
            this.rx = f10;
        }
    }

    public enum ScaleMode {
        Default,
        ByWidth
    }

    public static class StyleSet {
        HashMap<String, String> styleMap;

        public String getStyle(String str) {
            return this.styleMap.get(str);
        }

        private StyleSet(StyleSet styleSet) {
            HashMap<String, String> map = new HashMap<>();
            this.styleMap = map;
            map.putAll(styleSet.styleMap);
        }

        private StyleSet(String str) {
            this.styleMap = new HashMap<>();
            for (String str2 : str.split(";")) {
                String[] strArrSplit = str2.split(":");
                if (strArrSplit.length == 2) {
                    this.styleMap.put(strArrSplit[0].trim(), strArrSplit[1].trim());
                }
            }
        }
    }

    public static class SvgDrawable extends Drawable {
        private static float gradientWidth;
        private static long lastUpdateTime;
        private static WeakReference<Drawable> shiftDrawable;
        private static Runnable shiftRunnable;
        private static float totalTranslation;
        private Paint backgroundPaint;
        private float colorAlpha;
        private int currentColorKey;
        private org.telegram.ui.ActionBar.c6 currentResourcesProvider;
        protected int height;
        private Integer overrideColor;
        private Paint overridePaint;
        private ImageReceiver parentImageReceiver;
        protected int width;
        private static final int[] parentPosition = new int[2];
        private static boolean lite = LiteMode.isEnabled(32);
        protected ArrayList<Object> commands = new ArrayList<>();
        protected HashMap<Object, Paint> paints = new HashMap<>();
        private final Bitmap[] backgroundBitmap = new Bitmap[3];
        private final Canvas[] backgroundCanvas = new Canvas[3];
        private final LinearGradient[] placeholderGradient = new LinearGradient[3];
        private final Matrix[] placeholderMatrix = new Matrix[3];
        private final int[] currentColor = new int[2];
        private float crossfadeAlpha = 1.0f;
        SparseArray<Paint> overridePaintByPosition = new SparseArray<>();
        private boolean aspectFill = true;
        private boolean aspectCenter = false;

        public void addCommand(Object obj, Paint paint) {
            this.commands.add(obj);
            this.paints.put(obj, new Paint(paint));
        }

        public static void updateLiteValues() {
            lite = LiteMode.isEnabled(32);
        }

        public void copyCommandFromPosition(int i10) {
            ArrayList<Object> arrayList = this.commands;
            arrayList.add(arrayList.get(i10));
        }

        @Override
        public void draw(Canvas canvas) {
            drawInternal(canvas, false, 0, System.currentTimeMillis(), getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
        }

        public void drawInternal(Canvas canvas, boolean z10, int i10, long j10, float f10, float f11, float f12, float f13) {
            long j11;
            int i11;
            int i12 = this.currentColorKey;
            if (i12 >= 0) {
                setupGradient(i12, this.currentResourcesProvider, this.colorAlpha, z10);
            }
            float scale = getScale((int) f12, (int) f13);
            if (this.placeholderGradient[i10] != null) {
                float f14 = gradientWidth;
                if (f14 > 0.0f && lite) {
                    if (z10) {
                        long j12 = j10 - lastUpdateTime;
                        j11 = j12 <= 64 ? j12 : 64L;
                        if (j11 > 0) {
                            lastUpdateTime = j10;
                            totalTranslation = a9.p.d(j11, f14, 1800.0f, totalTranslation);
                            while (true) {
                                float f15 = totalTranslation;
                                float f16 = gradientWidth;
                                if (f15 < f16 * 2.0f) {
                                    break;
                                } else {
                                    totalTranslation = f15 - (f16 * 2.0f);
                                }
                            }
                        }
                    } else if (shiftRunnable == null || shiftDrawable.get() == this) {
                        long j13 = j10 - lastUpdateTime;
                        j11 = j13 <= 64 ? j13 : 64L;
                        long j14 = j11 >= 0 ? j11 : 0L;
                        lastUpdateTime = j10;
                        totalTranslation = a9.p.d(j14, gradientWidth, 1800.0f, totalTranslation);
                        while (true) {
                            float f17 = totalTranslation;
                            float f18 = gradientWidth;
                            if (f17 < f18 / 2.0f) {
                                break;
                            } else {
                                totalTranslation = f17 - f18;
                            }
                        }
                        shiftDrawable = new WeakReference<>(this);
                        Runnable runnable = shiftRunnable;
                        if (runnable != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable);
                        }
                        w1 w1Var = new w1(22);
                        shiftRunnable = w1Var;
                        AndroidUtilities.runOnUIThread(w1Var, ((int) (1000.0f / AndroidUtilities.screenRefreshRate)) - 1);
                    }
                    ImageReceiver imageReceiver = this.parentImageReceiver;
                    if (imageReceiver == null || z10) {
                        i11 = 0;
                    } else {
                        int[] iArr = parentPosition;
                        imageReceiver.getParentPosition(iArr);
                        i11 = iArr[0];
                    }
                    int i13 = z10 ? i10 + 1 : 0;
                    Matrix matrix = this.placeholderMatrix[i13];
                    if (matrix != null) {
                        matrix.reset();
                        if (z10) {
                            this.placeholderMatrix[i13].postTranslate(((-i11) + totalTranslation) - f10, 0.0f);
                        } else {
                            this.placeholderMatrix[i13].postTranslate(((-i11) + totalTranslation) - f10, 0.0f);
                        }
                        float f19 = 1.0f / scale;
                        this.placeholderMatrix[i13].postScale(f19, f19);
                        this.placeholderGradient[i13].setLocalMatrix(this.placeholderMatrix[i13]);
                        ImageReceiver imageReceiver2 = this.parentImageReceiver;
                        if (imageReceiver2 != null && !z10) {
                            imageReceiver2.invalidate();
                        }
                    }
                }
            }
            canvas.save();
            canvas.translate(f10, f11);
            if (!this.aspectFill || this.aspectCenter) {
                canvas.translate(com.google.android.recaptcha.internal.a.w(this.width, scale, f12, 2.0f), com.google.android.recaptcha.internal.a.w(this.height, scale, f13, 2.0f));
            }
            canvas.scale(scale, scale);
            int size = this.commands.size();
            for (int i14 = 0; i14 < size; i14++) {
                Object obj = this.commands.get(i14);
                if (obj instanceof Matrix) {
                    canvas.save();
                    canvas.concat((Matrix) obj);
                } else if (obj == null) {
                    canvas.restore();
                } else {
                    Paint paint = this.overridePaintByPosition.get(i14);
                    if (paint == null) {
                        paint = this.overridePaint;
                    }
                    if (z10) {
                        paint = this.backgroundPaint;
                    } else if (paint == null) {
                        paint = this.paints.get(obj);
                    }
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (this.crossfadeAlpha * alpha));
                    if (obj instanceof Path) {
                        canvas.drawPath((Path) obj, paint);
                    } else if (obj instanceof Rect) {
                        canvas.drawRect((Rect) obj, paint);
                    } else if (obj instanceof RectF) {
                        canvas.drawRect((RectF) obj, paint);
                    } else if (obj instanceof Line) {
                        Line line = (Line) obj;
                        canvas.drawLine(line.f19638x1, line.f19640y1, line.f19639x2, line.f19641y2, paint);
                    } else if (obj instanceof Circle) {
                        Circle circle = (Circle) obj;
                        canvas.drawCircle(circle.f19636x1, circle.f19637y1, circle.rad, paint);
                    } else if (obj instanceof Oval) {
                        canvas.drawOval(((Oval) obj).rect, paint);
                    } else if (obj instanceof RoundRect) {
                        RoundRect roundRect = (RoundRect) obj;
                        RectF rectF = roundRect.rect;
                        float f20 = roundRect.rx;
                        canvas.drawRoundRect(rectF, f20, f20, paint);
                    }
                    paint.setAlpha(alpha);
                }
            }
            canvas.restore();
        }

        @Override
        public int getIntrinsicHeight() {
            return this.width;
        }

        @Override
        public int getIntrinsicWidth() {
            return this.height;
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        public float getScale(int i10, int i11) {
            float f10 = i10 / this.width;
            float f11 = i11 / this.height;
            return this.aspectFill ? Math.max(f10, f11) : Math.min(f10, f11);
        }

        public void overrideWidthAndHeight(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        @Override
        public void setAlpha(int i10) {
            this.crossfadeAlpha = i10 / 255.0f;
        }

        public void setAspectCenter(boolean z10) {
            this.aspectCenter = z10;
        }

        public void setAspectFill(boolean z10) {
            this.aspectFill = z10;
        }

        public void setColor(int i10) {
            this.overrideColor = Integer.valueOf(i10);
        }

        public void setColorKey(int i10) {
            this.currentColorKey = i10;
        }

        public void setPaint(Paint paint) {
            this.overridePaint = paint;
        }

        public void setParent(ImageReceiver imageReceiver) {
            this.parentImageReceiver = imageReceiver;
        }

        public void setupGradient(int i10, float f10, boolean z10) {
            setupGradient(i10, null, f10, z10);
        }

        public SvgDrawable clone() {
            SvgDrawable svgDrawable = new SvgDrawable();
            for (int i10 = 0; i10 < this.commands.size(); i10++) {
                svgDrawable.commands.add(this.commands.get(i10));
                Paint paint = this.paints.get(this.commands.get(i10));
                if (paint != null) {
                    Paint paint2 = new Paint();
                    paint2.setColor(paint.getColor());
                    paint2.setStrokeCap(paint.getStrokeCap());
                    paint2.setStrokeJoin(paint.getStrokeJoin());
                    paint2.setStrokeWidth(paint.getStrokeWidth());
                    paint2.setStyle(paint.getStyle());
                    svgDrawable.paints.put(this.commands.get(i10), paint2);
                }
            }
            svgDrawable.width = this.width;
            svgDrawable.height = this.height;
            return svgDrawable;
        }

        public void setColorKey(int i10, org.telegram.ui.ActionBar.c6 c6Var) {
            this.currentColorKey = i10;
            this.currentResourcesProvider = c6Var;
        }

        public void setPaint(Paint paint, int i10) {
            this.overridePaintByPosition.put(i10, paint);
        }

        public void setupGradient(int i10, org.telegram.ui.ActionBar.c6 c6Var, float f10, boolean z10) {
            Shader bitmapShader;
            Integer num = this.overrideColor;
            int iV0 = num == null ? org.telegram.ui.ActionBar.g6.v0(i10, c6Var) : num.intValue();
            this.currentResourcesProvider = c6Var;
            int[] iArr = this.currentColor;
            if (iArr[z10 ? 1 : 0] != iV0) {
                this.colorAlpha = f10;
                this.currentColorKey = i10;
                iArr[z10 ? 1 : 0] = iV0;
                gradientWidth = AndroidUtilities.displaySize.x * 2;
                if (!lite) {
                    int iK = i0.b.k(iV0, 70);
                    if (z10) {
                        if (this.backgroundPaint == null) {
                            this.backgroundPaint = new Paint(1);
                        }
                        this.backgroundPaint.setShader(null);
                        this.backgroundPaint.setColor(iK);
                        return;
                    }
                    for (Paint paint : this.paints.values()) {
                        paint.setShader(null);
                        paint.setColor(iK);
                    }
                    return;
                }
                float fDp = AndroidUtilities.dp(180.0f) / gradientWidth;
                int iArgb = Color.argb((int) ((Color.alpha(iV0) / 2) * this.colorAlpha), Color.red(iV0), Color.green(iV0), Color.blue(iV0));
                float f11 = (1.0f - fDp) / 2.0f;
                LinearGradient[] linearGradientArr = this.placeholderGradient;
                float f12 = fDp / 2.0f;
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                linearGradientArr[z10 ? 1 : 0] = new LinearGradient(0.0f, 0.0f, gradientWidth, 0.0f, new int[]{0, 0, iArgb, 0, 0}, new float[]{0.0f, f11 - f12, f11, f12 + f11, 1.0f}, tileMode);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28) {
                    bitmapShader = new LinearGradient(0.0f, 0.0f, gradientWidth, 0.0f, new int[]{iArgb, iArgb}, (float[]) null, tileMode);
                } else {
                    Bitmap[] bitmapArr = this.backgroundBitmap;
                    if (bitmapArr[z10 ? 1 : 0] == null) {
                        bitmapArr[z10 ? 1 : 0] = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                        this.backgroundCanvas[z10 ? 1 : 0] = new Canvas(this.backgroundBitmap[z10 ? 1 : 0]);
                    }
                    this.backgroundCanvas[z10 ? 1 : 0].drawColor(iArgb);
                    bitmapShader = new BitmapShader(this.backgroundBitmap[z10 ? 1 : 0], tileMode, tileMode);
                }
                this.placeholderMatrix[z10 ? 1 : 0] = new Matrix();
                this.placeholderGradient[z10 ? 1 : 0].setLocalMatrix(this.placeholderMatrix[z10 ? 1 : 0]);
                if (z10) {
                    if (this.backgroundPaint == null) {
                        this.backgroundPaint = new Paint(1);
                    }
                    if (i11 <= 22) {
                        this.backgroundPaint.setShader(bitmapShader);
                        return;
                    } else {
                        this.backgroundPaint.setShader(new ComposeShader(this.placeholderGradient[z10 ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
                        return;
                    }
                }
                for (Paint paint2 : this.paints.values()) {
                    if (Build.VERSION.SDK_INT <= 22) {
                        paint2.setShader(bitmapShader);
                    } else {
                        paint2.setShader(new ComposeShader(this.placeholderGradient[z10 ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
                    }
                }
            }
        }

        public void addCommand(Object obj) {
            this.commands.add(obj);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public interface SvgResult {
        Bitmap getBitmap();

        SvgDrawable getDrawable();

        List<mf.c> getGiftPatternPositions();
    }

    static {
        int i10 = 0;
        while (true) {
            double[] dArr = pow10;
            if (i10 >= dArr.length) {
                SPLIT_BOUNDARY = Pattern.compile("(?<=\\))\\s*(?=[A-Za-z])");
                return;
            } else {
                dArr[i10] = Math.pow(10.0d, i10);
                i10++;
            }
        }
    }

    private static float[] arcToBeziers(double d, double d10) {
        int iCeil = (int) Math.ceil((Math.abs(d10) * 2.0d) / 3.141592653589793d);
        double d11 = d10 / ((double) iCeil);
        double d12 = d11 / 2.0d;
        double dSin = (Math.sin(d12) * 1.3333333333333333d) / (Math.cos(d12) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i10 = 0;
        int i11 = 0;
        while (i10 < iCeil) {
            double d13 = (((double) i10) * d11) + d;
            double dCos = Math.cos(d13);
            double dSin2 = Math.sin(d13);
            float[] fArr2 = fArr;
            fArr2[i11] = (float) (dCos - (dSin * dSin2));
            fArr2[i11 + 1] = (float) ((dCos * dSin) + dSin2);
            double d14 = d13 + d11;
            double dCos2 = Math.cos(d14);
            double dSin3 = Math.sin(d14);
            fArr2[i11 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr2[i11 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i12 = i11 + 5;
            fArr2[i11 + 4] = (float) dCos2;
            i11 += 6;
            fArr2[i12] = (float) dSin3;
            i10++;
            fArr = fArr2;
            iCeil = iCeil;
        }
        return fArr;
    }

    private static double checkedArcCos(double d) {
        if (d < -1.0d) {
            return 3.141592653589793d;
        }
        if (d > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d);
    }

    public static String decompress(byte[] bArr) {
        try {
            StringBuilder sb2 = new StringBuilder(bArr.length * 2);
            sb2.append('M');
            for (byte b10 : bArr) {
                int i10 = b10 & 255;
                if (i10 >= 192) {
                    sb2.append("AACAAAAHAAALMAAAQASTAVAAAZaacaaaahaaalmaaaqastava.az0123456789-,".charAt(i10 - 192));
                } else {
                    if (i10 >= 128) {
                        sb2.append(',');
                    } else if (i10 >= 64) {
                        sb2.append('-');
                    }
                    sb2.append(b10 & 63);
                }
            }
            sb2.append('z');
            return sb2.toString();
        } catch (Exception e9) {
            FileLog.e(e9);
            return "";
        }
    }

    public static Path doPath(String str) {
        char c10;
        float f10;
        float f11;
        float f12;
        float fNextFloat;
        float fNextFloat2;
        float fNextFloat3;
        float fNextFloat4;
        String str2 = str;
        if (ApplicationLoader.isAndroidTestEnvironment()) {
            return new Path();
        }
        int length = str2.length();
        ParserHelper parserHelper = new ParserHelper(str2, 0);
        parserHelper.skipWhitespace();
        Path path = new Path();
        char c11 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (true) {
            int i10 = parserHelper.pos;
            if (i10 >= length) {
                return path;
            }
            char cCharAt = str2.charAt(i10);
            switch (cCharAt) {
                case '+':
                case '-':
                case '.':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    if (c11 != 'm' && c11 != 'M') {
                        if (c11 == 'c' || c11 == 'C' || c11 == 'l' || c11 == 'L' || c11 == 's' || c11 == 'S' || c11 == 'h' || c11 == 'H' || c11 == 'v' || c11 == 'V' || c11 == 'q' || c11 == 'Q' || c11 == 'a' || c11 == 'A' || c11 == 't' || c11 == 'T') {
                            c10 = c11;
                        }
                        break;
                    } else {
                        char c12 = c11;
                        c11 = (char) (c11 - 1);
                        c10 = c12;
                        break;
                    }
                case ',':
                case '/':
                default:
                    parserHelper.advance();
                    c10 = cCharAt;
                    c11 = c10;
                    break;
            }
            boolean z10 = true;
            switch (c11) {
                case 'A':
                case 'a':
                    float fNextFloat5 = parserHelper.nextFloat();
                    float fNextFloat6 = parserHelper.nextFloat();
                    float f19 = f15;
                    float fNextFloat7 = parserHelper.nextFloat();
                    boolean z11 = ((int) parserHelper.nextFloat()) == 1;
                    z10 = ((int) parserHelper.nextFloat()) == 1;
                    float fNextFloat8 = parserHelper.nextFloat();
                    float fNextFloat9 = parserHelper.nextFloat();
                    if (c11 == 'a') {
                        fNextFloat9 += f14;
                        f10 = fNextFloat8 + f13;
                    } else {
                        f10 = fNextFloat8;
                    }
                    float f20 = f16;
                    float f21 = fNextFloat9;
                    drawArc(path, f13, f14, f10, f21, fNextFloat5, fNextFloat6, fNextFloat7, z11, z10);
                    f13 = f10;
                    f14 = f21;
                    f16 = f20;
                    f15 = f19;
                    z10 = false;
                    break;
                case 'C':
                case 'c':
                    float fNextFloat10 = parserHelper.nextFloat();
                    float fNextFloat11 = parserHelper.nextFloat();
                    float fNextFloat12 = parserHelper.nextFloat();
                    float fNextFloat13 = parserHelper.nextFloat();
                    float fNextFloat14 = parserHelper.nextFloat();
                    float fNextFloat15 = parserHelper.nextFloat();
                    if (c11 == 'c') {
                        fNextFloat10 += f13;
                        fNextFloat12 += f13;
                        fNextFloat14 += f13;
                        fNextFloat11 += f14;
                        fNextFloat13 += f14;
                        fNextFloat15 += f14;
                    }
                    float f22 = fNextFloat10;
                    float f23 = fNextFloat11;
                    f11 = fNextFloat12;
                    f12 = fNextFloat13;
                    fNextFloat = fNextFloat14;
                    fNextFloat2 = fNextFloat15;
                    path.cubicTo(f22, f23, f11, f12, fNextFloat, fNextFloat2);
                    f17 = f11;
                    f18 = f12;
                    f13 = fNextFloat;
                    f14 = fNextFloat2;
                    break;
                case 'H':
                case 'h':
                    float fNextFloat16 = parserHelper.nextFloat();
                    if (c11 == 'h') {
                        path.rLineTo(fNextFloat16, 0.0f);
                        f13 += fNextFloat16;
                    } else {
                        path.lineTo(fNextFloat16, f14);
                        f13 = fNextFloat16;
                    }
                    z10 = false;
                    break;
                case 'L':
                case 'l':
                    fNextFloat3 = parserHelper.nextFloat();
                    fNextFloat4 = parserHelper.nextFloat();
                    if (c11 == 'l') {
                        path.rLineTo(fNextFloat3, fNextFloat4);
                        f13 += fNextFloat3;
                        f14 += fNextFloat4;
                    } else {
                        path.lineTo(fNextFloat3, fNextFloat4);
                        f13 = fNextFloat3;
                        f14 = fNextFloat4;
                    }
                    z10 = false;
                    break;
                case 'M':
                case 'm':
                    fNextFloat3 = parserHelper.nextFloat();
                    fNextFloat4 = parserHelper.nextFloat();
                    if (c11 == 'm') {
                        f15 += fNextFloat3;
                        f16 += fNextFloat4;
                        path.rMoveTo(fNextFloat3, fNextFloat4);
                        f13 += fNextFloat3;
                        f14 += fNextFloat4;
                    } else {
                        path.moveTo(fNextFloat3, fNextFloat4);
                        f13 = fNextFloat3;
                        f15 = f13;
                        f14 = fNextFloat4;
                        f16 = f14;
                    }
                    z10 = false;
                    break;
                case 'Q':
                case 'q':
                    float fNextFloat17 = parserHelper.nextFloat();
                    float fNextFloat18 = parserHelper.nextFloat();
                    float fNextFloat19 = parserHelper.nextFloat();
                    float fNextFloat20 = parserHelper.nextFloat();
                    if (c11 == 'q') {
                        fNextFloat17 += f13;
                        fNextFloat18 += f14;
                        fNextFloat19 += f13;
                        fNextFloat20 += f14;
                    }
                    f17 = fNextFloat17;
                    f13 = fNextFloat19;
                    f14 = fNextFloat20;
                    path.quadTo(f17, fNextFloat18, f13, f14);
                    f18 = fNextFloat18;
                    break;
                case 'S':
                case 's':
                    float fNextFloat21 = parserHelper.nextFloat();
                    float fNextFloat22 = parserHelper.nextFloat();
                    float fNextFloat23 = parserHelper.nextFloat();
                    float fNextFloat24 = parserHelper.nextFloat();
                    if (c11 == 's') {
                        fNextFloat21 += f13;
                        fNextFloat23 += f13;
                        fNextFloat22 += f14;
                        fNextFloat24 += f14;
                    }
                    fNextFloat = fNextFloat23;
                    float f24 = (f13 * 2.0f) - f17;
                    float f25 = (f14 * 2.0f) - f18;
                    f11 = fNextFloat21;
                    f12 = fNextFloat22;
                    fNextFloat2 = fNextFloat24;
                    path.cubicTo(f24, f25, f11, f12, fNextFloat, fNextFloat2);
                    f17 = f11;
                    f18 = f12;
                    f13 = fNextFloat;
                    f14 = fNextFloat2;
                    break;
                case 'T':
                case 't':
                    fNextFloat = parserHelper.nextFloat();
                    fNextFloat2 = parserHelper.nextFloat();
                    if (c11 == 't') {
                        fNextFloat += f13;
                        fNextFloat2 += f14;
                    }
                    f17 = (f13 * 2.0f) - f17;
                    float f26 = (f14 * 2.0f) - f18;
                    path.quadTo(f17, f26, fNextFloat, fNextFloat2);
                    f18 = f26;
                    f13 = fNextFloat;
                    f14 = fNextFloat2;
                    break;
                case 'V':
                case 'v':
                    float fNextFloat25 = parserHelper.nextFloat();
                    if (c11 == 'v') {
                        path.rLineTo(0.0f, fNextFloat25);
                        f14 += fNextFloat25;
                    } else {
                        path.lineTo(f13, fNextFloat25);
                        f14 = fNextFloat25;
                    }
                    z10 = false;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f15, f16);
                    f13 = f15;
                    f17 = f13;
                    f14 = f16;
                    f18 = f14;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (!z10) {
                f17 = f13;
                f18 = f14;
            }
            parserHelper.skipWhitespace();
            str2 = str;
            c11 = c10;
        }
    }

    private static void drawArc(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
        if (f10 == f12 && f11 == f13) {
            return;
        }
        if (f14 == 0.0f || f15 == 0.0f) {
            path.lineTo(f12, f13);
            return;
        }
        float fAbs = Math.abs(f14);
        float fAbs2 = Math.abs(f15);
        double radians = Math.toRadians(((double) f16) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d = ((double) (f10 - f12)) / 2.0d;
        double d10 = ((double) (f11 - f13)) / 2.0d;
        double d11 = (dSin * d10) + (dCos * d);
        double d12 = (d10 * dCos) + ((-dSin) * d);
        double d13 = fAbs * fAbs;
        double d14 = fAbs2 * fAbs2;
        double d15 = d11 * d11;
        double d16 = d12 * d12;
        double d17 = (d16 / d14) + (d15 / d13);
        if (d17 > 0.99999d) {
            double dSqrt = Math.sqrt(d17) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d13 = fAbs * fAbs;
            d14 = fAbs2 * fAbs2;
        }
        double d18 = z10 == z11 ? -1.0d : 1.0d;
        double d19 = d13 * d14;
        double d20 = d13 * d16;
        double d21 = d14 * d15;
        double d22 = ((d19 - d20) - d21) / (d20 + d21);
        if (d22 < 0.0d) {
            d22 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d22) * d18;
        double d23 = fAbs;
        double d24 = d23 * d12;
        double d25 = fAbs2;
        double d26 = (d24 / d25) * dSqrt2;
        double d27 = dSqrt2 * (-((d25 * d11) / d23));
        double d28 = ((dCos * d26) - (dSin * d27)) + (((double) (f10 + f12)) / 2.0d);
        double d29 = (dCos * d27) + (dSin * d26) + (((double) (f11 + f13)) / 2.0d);
        double d30 = (d11 - d26) / d23;
        double d31 = (d12 - d27) / d25;
        double d32 = ((-d11) - d26) / d23;
        double d33 = ((-d12) - d27) / d25;
        double d34 = (d31 * d31) + (d30 * d30);
        double dAcos = Math.acos(d30 / Math.sqrt(d34)) * (d31 < 0.0d ? -1.0d : 1.0d);
        double dCheckedArcCos = ((d30 * d33) - (d31 * d32) < 0.0d ? -1.0d : 1.0d) * checkedArcCos(((d31 * d33) + (d30 * d32)) / Math.sqrt(((d33 * d33) + (d32 * d32)) * d34));
        if (dCheckedArcCos == 0.0d) {
            path.lineTo(f12, f13);
            return;
        }
        if (!z11 && dCheckedArcCos > 0.0d) {
            dCheckedArcCos -= 6.283185307179586d;
        } else if (z11 && dCheckedArcCos < 0.0d) {
            dCheckedArcCos += 6.283185307179586d;
        }
        float[] fArrArcToBeziers = arcToBeziers(dAcos % 6.283185307179586d, dCheckedArcCos % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f16);
        matrix.postTranslate((float) d28, (float) d29);
        matrix.mapPoints(fArrArcToBeziers);
        fArrArcToBeziers[fArrArcToBeziers.length - 2] = f12;
        fArrArcToBeziers[fArrArcToBeziers.length - 1] = f13;
        for (int i10 = 0; i10 < fArrArcToBeziers.length; i10 += 6) {
            path.cubicTo(fArrArcToBeziers[i10], fArrArcToBeziers[i10 + 1], fArrArcToBeziers[i10 + 2], fArrArcToBeziers[i10 + 3], fArrArcToBeziers[i10 + 4], fArrArcToBeziers[i10 + 5]);
        }
    }

    public static Bitmap getBitmap(int i10, int i11, int i12, int i13) {
        return getBitmap(i10, i11, i12, i13, 1.0f);
    }

    public static Bitmap getBitmapByPathOnly(String str, int i10, int i11, int i12, int i13) {
        try {
            Path pathDoPath = doPath(str);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(i12 / i10, i13 / i11);
            Paint paint = new Paint();
            paint.setColor(-1);
            canvas.drawPath(pathDoPath, paint);
            return bitmapCreateBitmap;
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static Integer getColorByName(String str) {
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "yellow":
                return -256;
            case "red":
                return -65536;
            case "blue":
                return -16776961;
            case "cyan":
                return -16711681;
            case "gray":
                return -7829368;
            case "black":
                return -16777216;
            case "green":
                return -16711936;
            case "white":
                return -1;
            case "magenta":
                return -65281;
            default:
                return null;
        }
    }

    public static SvgDrawable getDrawable(String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(0, 0, (Integer) null, true, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return sVGHandler.getDrawable();
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static SvgDrawable getDrawableByPath(String str, int i10, int i11) {
        try {
            Path pathDoPath = doPath(str);
            SvgDrawable svgDrawable = new SvgDrawable();
            svgDrawable.commands.add(pathDoPath);
            svgDrawable.paints.put(pathDoPath, new Paint(1));
            svgDrawable.width = i10;
            svgDrawable.height = i11;
            return svgDrawable;
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static Float getFloatAttr(String str, Attributes attributes) {
        return getFloatAttr(str, attributes, null);
    }

    private static Integer getHexAttr(String str, Attributes attributes) {
        String stringAttr = getStringAttr(str, attributes);
        if (stringAttr == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(stringAttr.substring(1), 16));
        } catch (NumberFormatException unused) {
            return getColorByName(stringAttr);
        }
    }

    public static NumberParse getNumberParseAttr(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            if (attributes.getLocalName(i10).equals(str)) {
                return parseNumbers(attributes.getValue(i10));
            }
        }
        return null;
    }

    public static String getStringAttr(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            if (attributes.getLocalName(i10).equals(str)) {
                return attributes.getValue(i10);
            }
        }
        return null;
    }

    public static SvgResult getSvgBitmap(File file, int i10, int i11, boolean z10) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                SVGHandler sVGHandler = new SVGHandler(i10, i11, z10 ? -1 : null, false, 1.0f);
                if (!z10) {
                    sVGHandler.alphaOnly = true;
                }
                xMLReader.setContentHandler(sVGHandler);
                xMLReader.parse(new InputSource(fileInputStream));
                fileInputStream.close();
                return sVGHandler;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    private static NumberParse parseNumbers(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int length2 = 0;
        boolean z10 = false;
        for (int i10 = 1; i10 < length; i10++) {
            if (z10) {
                z10 = false;
            } else {
                char cCharAt = str.charAt(i10);
                switch (cCharAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                    case '-':
                        if (cCharAt != '-' || str.charAt(i10 - 1) != 'e') {
                            String strSubstring = str.substring(length2, i10);
                            if (strSubstring.trim().length() > 0) {
                                arrayList.add(Float.valueOf(Float.parseFloat(strSubstring)));
                                if (cCharAt == '-') {
                                    length2 = i10;
                                } else {
                                    length2 = i10 + 1;
                                    z10 = true;
                                }
                            } else {
                                length2++;
                            }
                        }
                        break;
                    case ')':
                    case 'A':
                    case 'C':
                    case 'H':
                    case 'L':
                    case 'M':
                    case 'Q':
                    case 'S':
                    case 'T':
                    case 'V':
                    case 'Z':
                    case 'a':
                    case 'c':
                    case 'h':
                    case 'l':
                    case 'm':
                    case 'q':
                    case 's':
                    case 't':
                    case 'v':
                    case 'z':
                        String strSubstring2 = str.substring(length2, i10);
                        if (strSubstring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(strSubstring2)));
                        }
                        return new NumberParse(arrayList, i10);
                }
            }
        }
        String strSubstring3 = str.substring(length2);
        if (strSubstring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(strSubstring3)));
            } catch (NumberFormatException unused) {
            }
            length2 = str.length();
        }
        return new NumberParse(arrayList, length2);
    }

    public static Matrix parseTransform(String str) {
        Matrix matrix = new Matrix();
        Iterator<String> it = splitSvgTransforms(str).iterator();
        while (it.hasNext()) {
            Matrix transformCommand = parseTransformCommand(it.next());
            if (transformCommand != null) {
                matrix.preConcat(transformCommand);
            }
        }
        return matrix;
    }

    private static Matrix parseTransformCommand(String str) {
        float fFloatValue;
        if (str.startsWith("matrix(")) {
            NumberParse numbers = parseNumbers(str.substring(7));
            if (numbers.numbers.size() != 6) {
                return null;
            }
            Matrix matrix = new Matrix();
            matrix.setValues(new float[]{((Float) numbers.numbers.get(0)).floatValue(), ((Float) numbers.numbers.get(2)).floatValue(), ((Float) numbers.numbers.get(4)).floatValue(), ((Float) numbers.numbers.get(1)).floatValue(), ((Float) numbers.numbers.get(3)).floatValue(), ((Float) numbers.numbers.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
            return matrix;
        }
        if (str.startsWith("translate(")) {
            NumberParse numbers2 = parseNumbers(str.substring(10));
            if (numbers2.numbers.size() <= 0) {
                return null;
            }
            float fFloatValue2 = ((Float) numbers2.numbers.get(0)).floatValue();
            fFloatValue = numbers2.numbers.size() > 1 ? ((Float) numbers2.numbers.get(1)).floatValue() : 0.0f;
            Matrix matrix2 = new Matrix();
            matrix2.postTranslate(fFloatValue2, fFloatValue);
            return matrix2;
        }
        if (str.startsWith("scale(")) {
            NumberParse numbers3 = parseNumbers(str.substring(6));
            if (numbers3.numbers.size() <= 0) {
                return null;
            }
            float fFloatValue3 = ((Float) numbers3.numbers.get(0)).floatValue();
            fFloatValue = numbers3.numbers.size() > 1 ? ((Float) numbers3.numbers.get(1)).floatValue() : 0.0f;
            Matrix matrix3 = new Matrix();
            matrix3.postScale(fFloatValue3, fFloatValue);
            return matrix3;
        }
        if (str.startsWith("skewX(")) {
            NumberParse numbers4 = parseNumbers(str.substring(6));
            if (numbers4.numbers.size() <= 0) {
                return null;
            }
            float fFloatValue4 = ((Float) numbers4.numbers.get(0)).floatValue();
            Matrix matrix4 = new Matrix();
            matrix4.postSkew((float) Math.tan(fFloatValue4), 0.0f);
            return matrix4;
        }
        if (str.startsWith("skewY(")) {
            NumberParse numbers5 = parseNumbers(str.substring(6));
            if (numbers5.numbers.size() <= 0) {
                return null;
            }
            float fFloatValue5 = ((Float) numbers5.numbers.get(0)).floatValue();
            Matrix matrix5 = new Matrix();
            matrix5.postSkew(0.0f, (float) Math.tan(fFloatValue5));
            return matrix5;
        }
        if (!str.startsWith("rotate(")) {
            return null;
        }
        NumberParse numbers6 = parseNumbers(str.substring(7));
        if (numbers6.numbers.size() <= 0) {
            return null;
        }
        Matrix matrix6 = new Matrix();
        float fFloatValue6 = ((Float) numbers6.numbers.get(0)).floatValue();
        if (numbers6.numbers.size() > 2) {
            matrix6.postRotate(fFloatValue6, ((Float) numbers6.numbers.get(1)).floatValue(), ((Float) numbers6.numbers.get(2)).floatValue());
            return matrix6;
        }
        matrix6.postRotate(fFloatValue6);
        return matrix6;
    }

    private static List<String> splitSvgTransforms(String str) {
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        String[] strArrSplit = SPLIT_BOUNDARY.split(strTrim);
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            String strTrim2 = str2.trim();
            if (!strTrim2.isEmpty()) {
                arrayList.add(strTrim2);
            }
        }
        return arrayList;
    }

    public static class SVGHandler extends DefaultHandler implements SvgResult {
        private boolean alphaOnly;
        private Bitmap bitmap;
        private boolean boundsMode;
        private Canvas canvas;
        private int desiredHeight;
        private int desiredWidth;
        private SvgDrawable drawable;
        private float globalScale;
        private HashMap<String, StyleSet> globalStyles;
        private boolean insideGiftRect;
        private int insideGiftRectDepth;
        private List<mf.c> insideGiftRectPositions;
        private Paint paint;
        private Integer paintColor;
        boolean pushed;
        private RectF rect;
        private RectF rectTmp;
        private float scale;
        private ScaleMode scaleMode;
        private StringBuilder styles;

        private void doColor(Properties properties, Integer num, boolean z10) {
            Integer num2 = this.paintColor;
            if (num2 != null) {
                this.paint.setColor(num2.intValue());
            } else {
                this.paint.setColor((num.intValue() & 16777215) | (-16777216));
            }
            Float f10 = properties.getFloat("opacity");
            if (f10 == null) {
                f10 = properties.getFloat(z10 ? "fill-opacity" : "stroke-opacity");
            }
            if (f10 == null) {
                this.paint.setAlpha(255);
            } else {
                this.paint.setAlpha((int) (f10.floatValue() * 255.0f));
            }
        }

        private boolean doFill(Properties properties) {
            if ("none".equals(properties.getString("display"))) {
                return false;
            }
            String string = properties.getString("fill");
            if (string != null && string.startsWith("url(#")) {
                string.substring(5, string.length() - 1);
                return false;
            }
            Integer hex = properties.getHex("fill");
            if (hex != null) {
                doColor(properties, hex, true);
                this.paint.setStyle(Paint.Style.FILL);
                return true;
            }
            if (properties.getString("fill") != null || properties.getString("stroke") != null) {
                return false;
            }
            this.paint.setStyle(Paint.Style.FILL);
            Integer num = this.paintColor;
            if (num != null) {
                this.paint.setColor(num.intValue());
            } else {
                this.paint.setColor(-16777216);
            }
            return true;
        }

        private boolean doStroke(Properties properties) {
            Integer hex;
            if ("none".equals(properties.getString("display")) || (hex = properties.getHex("stroke")) == null) {
                return false;
            }
            doColor(properties, hex, false);
            Float f10 = properties.getFloat("stroke-width");
            if (f10 != null) {
                this.paint.setStrokeWidth(f10.floatValue());
            }
            String string = properties.getString("stroke-linecap");
            if ("round".equals(string)) {
                this.paint.setStrokeCap(Paint.Cap.ROUND);
            } else if ("square".equals(string)) {
                this.paint.setStrokeCap(Paint.Cap.SQUARE);
            } else if ("butt".equals(string)) {
                this.paint.setStrokeCap(Paint.Cap.BUTT);
            }
            String string2 = properties.getString("stroke-linejoin");
            if ("miter".equals(string2)) {
                this.paint.setStrokeJoin(Paint.Join.MITER);
            } else if ("round".equals(string2)) {
                this.paint.setStrokeJoin(Paint.Join.ROUND);
            } else if ("bevel".equals(string2)) {
                this.paint.setStrokeJoin(Paint.Join.BEVEL);
            }
            this.paint.setStyle(Paint.Style.STROKE);
            return true;
        }

        private void popTransform() {
            if (this.pushed) {
                SvgDrawable svgDrawable = this.drawable;
                if (svgDrawable != null) {
                    svgDrawable.addCommand(null);
                } else {
                    this.canvas.restore();
                }
            }
        }

        private void pushTransform(Attributes attributes) {
            String stringAttr = SvgHelper.getStringAttr("transform", attributes);
            boolean z10 = stringAttr != null;
            this.pushed = z10;
            if (z10) {
                Matrix transform = SvgHelper.parseTransform(stringAttr);
                SvgDrawable svgDrawable = this.drawable;
                if (svgDrawable != null) {
                    svgDrawable.addCommand(transform);
                } else {
                    this.canvas.save();
                    this.canvas.concat(transform);
                }
            }
        }

        @Override
        public void characters(char[] cArr, int i10, int i11) {
            StringBuilder sb2 = this.styles;
            if (sb2 != null) {
                sb2.append(cArr, i10, i11);
            }
        }

        @Override
        public void endElement(String str, String str2, String str3) {
            int iIndexOf;
            if (this.insideGiftRect) {
                int i10 = this.insideGiftRectDepth - 1;
                this.insideGiftRectDepth = i10;
                if (i10 == 0) {
                    this.insideGiftRect = false;
                }
                return;
            }
            str2.getClass();
            switch (str2) {
                case "g":
                case "defs":
                case "clipPath":
                    this.boundsMode = false;
                    break;
                case "style":
                    StringBuilder sb2 = this.styles;
                    if (sb2 != null) {
                        String[] strArrSplit = sb2.toString().split("\\}");
                        int i11 = 0;
                        while (true) {
                            if (i11 >= strArrSplit.length) {
                                this.styles = null;
                            } else {
                                String strReplace = strArrSplit[i11].trim().replace("\t", "").replace("\n", "");
                                strArrSplit[i11] = strReplace;
                                if (strReplace.length() != 0 && strArrSplit[i11].charAt(0) == '.' && (iIndexOf = strArrSplit[i11].indexOf(123)) >= 0) {
                                    this.globalStyles.put(strArrSplit[i11].substring(1, iIndexOf).trim(), new StyleSet(strArrSplit[i11].substring(iIndexOf + 1)));
                                }
                                i11++;
                            }
                            break;
                        }
                    }
                    break;
            }
        }

        @Override
        public Bitmap getBitmap() {
            return this.bitmap;
        }

        @Override
        public SvgDrawable getDrawable() {
            return this.drawable;
        }

        @Override
        public List<mf.c> getGiftPatternPositions() {
            return this.insideGiftRectPositions;
        }

        @Override
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            String stringAttr;
            int i10;
            Float fValueOf = Float.valueOf(0.0f);
            mf.c cVar = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            if (!"g".equals(str3) || this.insideGiftRect) {
                if (this.insideGiftRect) {
                    this.insideGiftRectDepth++;
                    if ("rect".equals(str3)) {
                        float f10 = this.scale;
                        try {
                            float f11 = Float.parseFloat(attributes.getValue("x"));
                            float f12 = Float.parseFloat(attributes.getValue("y"));
                            RectF rectF = new RectF(f11, f12, Float.parseFloat(attributes.getValue("width")) + f11, Float.parseFloat(attributes.getValue("height")) + f12);
                            Matrix transform = SvgHelper.parseTransform(attributes.getValue("transform"));
                            transform.postScale(f10, f10);
                            cVar = new mf.c(rectF, transform);
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        if (cVar != null) {
                            if (this.insideGiftRectPositions == null) {
                                this.insideGiftRectPositions = new ArrayList();
                            }
                            this.insideGiftRectPositions.add(cVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else if ("GiftPatterns".equals(attributes.getValue("id"))) {
                this.insideGiftRect = true;
                this.insideGiftRectDepth = 1;
            }
            if (!this.boundsMode || str2.equals("style")) {
                str2.getClass();
                switch (str2) {
                    case "ellipse":
                        Float floatAttr = SvgHelper.getFloatAttr("cx", attributes);
                        Float floatAttr2 = SvgHelper.getFloatAttr("cy", attributes);
                        Float floatAttr3 = SvgHelper.getFloatAttr("rx", attributes);
                        Float floatAttr4 = SvgHelper.getFloatAttr("ry", attributes);
                        if (floatAttr != null && floatAttr2 != null && floatAttr3 != null && floatAttr4 != null) {
                            pushTransform(attributes);
                            Properties properties = new Properties(attributes, this.globalStyles);
                            this.rect.set(floatAttr.floatValue() - floatAttr3.floatValue(), floatAttr2.floatValue() - floatAttr4.floatValue(), floatAttr3.floatValue() + floatAttr.floatValue(), floatAttr4.floatValue() + floatAttr2.floatValue());
                            if (doFill(properties)) {
                                SvgDrawable svgDrawable = this.drawable;
                                if (svgDrawable != null) {
                                    svgDrawable.addCommand(new Oval(this.rect), this.paint);
                                } else {
                                    this.canvas.drawOval(this.rect, this.paint);
                                }
                            }
                            if (doStroke(properties)) {
                                SvgDrawable svgDrawable2 = this.drawable;
                                if (svgDrawable2 != null) {
                                    svgDrawable2.addCommand(new Oval(this.rect), this.paint);
                                } else {
                                    this.canvas.drawOval(this.rect, this.paint);
                                }
                            }
                            popTransform();
                            break;
                        }
                        break;
                    case "circle":
                        Float floatAttr5 = SvgHelper.getFloatAttr("cx", attributes);
                        Float floatAttr6 = SvgHelper.getFloatAttr("cy", attributes);
                        Float floatAttr7 = SvgHelper.getFloatAttr("r", attributes);
                        if (floatAttr5 != null && floatAttr6 != null && floatAttr7 != null) {
                            pushTransform(attributes);
                            Properties properties2 = new Properties(attributes, this.globalStyles);
                            if (doFill(properties2)) {
                                SvgDrawable svgDrawable3 = this.drawable;
                                if (svgDrawable3 != null) {
                                    svgDrawable3.addCommand(new Circle(floatAttr5.floatValue(), floatAttr6.floatValue(), floatAttr7.floatValue()), this.paint);
                                } else {
                                    this.canvas.drawCircle(floatAttr5.floatValue(), floatAttr6.floatValue(), floatAttr7.floatValue(), this.paint);
                                }
                            }
                            if (doStroke(properties2)) {
                                SvgDrawable svgDrawable4 = this.drawable;
                                if (svgDrawable4 != null) {
                                    svgDrawable4.addCommand(new Circle(floatAttr5.floatValue(), floatAttr6.floatValue(), floatAttr7.floatValue()), this.paint);
                                } else {
                                    this.canvas.drawCircle(floatAttr5.floatValue(), floatAttr6.floatValue(), floatAttr7.floatValue(), this.paint);
                                }
                            }
                            popTransform();
                            break;
                        }
                        break;
                    case "polygon":
                    case "polyline":
                        NumberParse numberParseAttr = SvgHelper.getNumberParseAttr("points", attributes);
                        if (numberParseAttr != null) {
                            Path path = new Path();
                            ArrayList arrayList = numberParseAttr.numbers;
                            if (arrayList.size() > 1) {
                                pushTransform(attributes);
                                Properties properties3 = new Properties(attributes, this.globalStyles);
                                path.moveTo(((Float) arrayList.get(0)).floatValue(), ((Float) arrayList.get(1)).floatValue());
                                for (int i11 = 2; i11 < arrayList.size(); i11 += 2) {
                                    path.lineTo(((Float) arrayList.get(i11)).floatValue(), ((Float) arrayList.get(i11 + 1)).floatValue());
                                }
                                if (str2.equals("polygon")) {
                                    path.close();
                                }
                                if (doFill(properties3)) {
                                    SvgDrawable svgDrawable5 = this.drawable;
                                    if (svgDrawable5 != null) {
                                        svgDrawable5.addCommand(path, this.paint);
                                    } else {
                                        this.canvas.drawPath(path, this.paint);
                                    }
                                }
                                if (doStroke(properties3)) {
                                    SvgDrawable svgDrawable6 = this.drawable;
                                    if (svgDrawable6 != null) {
                                        svgDrawable6.addCommand(path, this.paint);
                                    } else {
                                        this.canvas.drawPath(path, this.paint);
                                    }
                                }
                                popTransform();
                            }
                            break;
                        }
                        break;
                    case "g":
                        if ("bounds".equalsIgnoreCase(SvgHelper.getStringAttr("id", attributes))) {
                            this.boundsMode = true;
                            break;
                        }
                        break;
                    case "svg":
                        Float floatAttr8 = SvgHelper.getFloatAttr("width", attributes);
                        Float floatAttr9 = SvgHelper.getFloatAttr("height", attributes);
                        if ((floatAttr8 == null || floatAttr9 == null) && (stringAttr = SvgHelper.getStringAttr("viewBox", attributes)) != null) {
                            String[] strArrSplit = stringAttr.split(" ");
                            Float fValueOf2 = Float.valueOf(Float.parseFloat(strArrSplit[2]));
                            floatAttr9 = Float.valueOf(Float.parseFloat(strArrSplit[3]));
                            floatAttr8 = fValueOf2;
                        }
                        if (floatAttr8 == null || floatAttr9 == null) {
                            floatAttr8 = Float.valueOf(this.desiredWidth);
                            floatAttr9 = Float.valueOf(this.desiredHeight);
                        }
                        int iCeil = (int) Math.ceil(floatAttr8.floatValue());
                        int iCeil2 = (int) Math.ceil(floatAttr9.floatValue());
                        if (iCeil == 0 || iCeil2 == 0) {
                            iCeil = this.desiredWidth;
                            iCeil2 = this.desiredHeight;
                        } else {
                            int i12 = this.desiredWidth;
                            if (i12 != 0 && (i10 = this.desiredHeight) != 0) {
                                if (this.scaleMode == ScaleMode.ByWidth) {
                                    this.scale = i12 / iCeil;
                                } else {
                                    this.scale = Math.min(i12 / iCeil, i10 / iCeil2);
                                }
                                float f13 = this.scale;
                                iCeil = (int) (iCeil * f13);
                                iCeil2 = (int) (iCeil2 * f13);
                            }
                        }
                        SvgDrawable svgDrawable7 = this.drawable;
                        if (svgDrawable7 != null) {
                            svgDrawable7.width = iCeil;
                            svgDrawable7.height = iCeil2;
                            break;
                        } else {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, this.alphaOnly ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888);
                            this.bitmap = bitmapCreateBitmap;
                            bitmapCreateBitmap.eraseColor(0);
                            Canvas canvas = new Canvas(this.bitmap);
                            this.canvas = canvas;
                            float f14 = this.scale;
                            if (f14 != 0.0f) {
                                float f15 = this.globalScale;
                                canvas.scale(f15 * f14, f15 * f14);
                            }
                            break;
                        }
                        break;
                    case "defs":
                    case "clipPath":
                        this.boundsMode = true;
                        break;
                    case "line":
                        Float floatAttr10 = SvgHelper.getFloatAttr("x1", attributes);
                        Float floatAttr11 = SvgHelper.getFloatAttr("x2", attributes);
                        Float floatAttr12 = SvgHelper.getFloatAttr("y1", attributes);
                        Float floatAttr13 = SvgHelper.getFloatAttr("y2", attributes);
                        if (doStroke(new Properties(attributes, this.globalStyles))) {
                            pushTransform(attributes);
                            SvgDrawable svgDrawable8 = this.drawable;
                            if (svgDrawable8 != null) {
                                svgDrawable8.addCommand(new Line(floatAttr10.floatValue(), floatAttr12.floatValue(), floatAttr11.floatValue(), floatAttr13.floatValue()), this.paint);
                            } else {
                                this.canvas.drawLine(floatAttr10.floatValue(), floatAttr12.floatValue(), floatAttr11.floatValue(), floatAttr13.floatValue(), this.paint);
                            }
                            popTransform();
                            break;
                        }
                        break;
                    case "path":
                        Path pathDoPath = SvgHelper.doPath(SvgHelper.getStringAttr("d", attributes));
                        pushTransform(attributes);
                        Properties properties4 = new Properties(attributes, this.globalStyles);
                        if (doFill(properties4)) {
                            SvgDrawable svgDrawable9 = this.drawable;
                            if (svgDrawable9 != null) {
                                svgDrawable9.addCommand(pathDoPath, this.paint);
                            } else {
                                this.canvas.drawPath(pathDoPath, this.paint);
                            }
                        }
                        if (doStroke(properties4)) {
                            SvgDrawable svgDrawable10 = this.drawable;
                            if (svgDrawable10 != null) {
                                svgDrawable10.addCommand(pathDoPath, this.paint);
                            } else {
                                this.canvas.drawPath(pathDoPath, this.paint);
                            }
                        }
                        popTransform();
                        break;
                    case "rect":
                        Float floatAttr14 = SvgHelper.getFloatAttr("x", attributes);
                        if (floatAttr14 == null) {
                            floatAttr14 = fValueOf;
                        }
                        Float floatAttr15 = SvgHelper.getFloatAttr("y", attributes);
                        if (floatAttr15 != null) {
                            fValueOf = floatAttr15;
                        }
                        Float floatAttr16 = SvgHelper.getFloatAttr("width", attributes);
                        Float floatAttr17 = SvgHelper.getFloatAttr("height", attributes);
                        Float floatAttr18 = SvgHelper.getFloatAttr("rx", attributes, null);
                        pushTransform(attributes);
                        Properties properties5 = new Properties(attributes, this.globalStyles);
                        if (doFill(properties5)) {
                            SvgDrawable svgDrawable11 = this.drawable;
                            if (svgDrawable11 != null) {
                                if (floatAttr18 != null) {
                                    svgDrawable11.addCommand(new RoundRect(new RectF(floatAttr14.floatValue(), fValueOf.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + fValueOf.floatValue()), floatAttr18.floatValue()), this.paint);
                                } else {
                                    svgDrawable11.addCommand(new RectF(floatAttr14.floatValue(), fValueOf.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + fValueOf.floatValue()), this.paint);
                                }
                            } else if (floatAttr18 != null) {
                                this.rectTmp.set(floatAttr14.floatValue(), fValueOf.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + fValueOf.floatValue());
                                this.canvas.drawRoundRect(this.rectTmp, floatAttr18.floatValue(), floatAttr18.floatValue(), this.paint);
                            } else {
                                this.canvas.drawRect(floatAttr14.floatValue(), fValueOf.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + fValueOf.floatValue(), this.paint);
                            }
                        }
                        if (doStroke(properties5)) {
                            SvgDrawable svgDrawable12 = this.drawable;
                            if (svgDrawable12 != null) {
                                if (floatAttr18 != null) {
                                    svgDrawable12.addCommand(new RoundRect(new RectF(floatAttr14.floatValue(), fValueOf.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + fValueOf.floatValue()), floatAttr18.floatValue()), this.paint);
                                } else {
                                    svgDrawable12.addCommand(new RectF(floatAttr14.floatValue(), fValueOf.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + fValueOf.floatValue()), this.paint);
                                }
                            } else if (floatAttr18 != null) {
                                this.rectTmp.set(floatAttr14.floatValue(), fValueOf.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + fValueOf.floatValue());
                                this.canvas.drawRoundRect(this.rectTmp, floatAttr18.floatValue(), floatAttr18.floatValue(), this.paint);
                            } else {
                                this.canvas.drawRect(floatAttr14.floatValue(), fValueOf.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + fValueOf.floatValue(), this.paint);
                            }
                        }
                        popTransform();
                        break;
                    case "style":
                        this.styles = new StringBuilder();
                        break;
                }
            }
        }

        private SVGHandler(int i10, int i11, Integer num, boolean z10, float f10) {
            this(i10, i11, num, z10, f10, ScaleMode.Default);
        }

        private SVGHandler(int i10, int i11, Integer num, boolean z10, float f10, ScaleMode scaleMode) {
            this.scale = 1.0f;
            this.paint = new Paint(1);
            this.rect = new RectF();
            this.rectTmp = new RectF();
            this.globalScale = 1.0f;
            this.pushed = false;
            this.globalStyles = new HashMap<>();
            this.insideGiftRect = false;
            this.insideGiftRectDepth = 0;
            this.globalScale = f10;
            this.desiredWidth = i10;
            this.desiredHeight = i11;
            this.paintColor = num;
            this.scaleMode = scaleMode;
            if (z10) {
                this.drawable = new SvgDrawable();
            }
        }

        @Override
        public void endDocument() {
        }

        @Override
        public void startDocument() {
        }
    }

    public static Bitmap getBitmap(int i10, int i11, int i12, int i13, float f10) {
        return getBitmap(i10, i11, i12, i13, f10, ScaleMode.Default);
    }

    public static Float getFloatAttr(String str, Attributes attributes, Float f10) {
        String stringAttr = getStringAttr(str, attributes);
        if (stringAttr == null) {
            return f10;
        }
        if (stringAttr.endsWith("px")) {
            stringAttr = com.google.android.recaptcha.internal.a.n(stringAttr, 2, 0);
        } else if (stringAttr.endsWith("mm")) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(stringAttr));
    }

    public static Bitmap getBitmap(int i10, int i11, int i12, int i13, float f10, ScaleMode scaleMode) {
        try {
            InputStream inputStreamOpenRawResource = ApplicationLoader.applicationContext.getResources().openRawResource(i10);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                SVGHandler sVGHandler = new SVGHandler(i11, i12, Integer.valueOf(i13), false, f10, scaleMode);
                xMLReader.setContentHandler(sVGHandler);
                xMLReader.parse(new InputSource(inputStreamOpenRawResource));
                Bitmap bitmap = sVGHandler.getBitmap();
                if (inputStreamOpenRawResource != null) {
                    inputStreamOpenRawResource.close();
                }
                return bitmap;
            } catch (Throwable th) {
                if (inputStreamOpenRawResource == null) {
                    throw th;
                }
                try {
                    inputStreamOpenRawResource.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static SvgDrawable getDrawableByPath(Path path, int i10, int i11) {
        try {
            SvgDrawable svgDrawable = new SvgDrawable();
            svgDrawable.commands.add(path);
            svgDrawable.paints.put(path, new Paint(1));
            svgDrawable.width = i10;
            svgDrawable.height = i11;
            return svgDrawable;
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static SvgDrawable getDrawable(int i10, Integer num) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(0, 0, num, true, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(ApplicationLoader.applicationContext.getResources().openRawResource(i10)));
            return sVGHandler.getDrawable();
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static Bitmap getBitmap(InputStream inputStream, int i10, int i11, boolean z10) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(i10, i11, z10 ? -1 : null, false, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(inputStream));
            return sVGHandler.getBitmap();
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static Bitmap getBitmap(File file, int i10, int i11, boolean z10) {
        return getBitmap(file, i10, i11, z10, ScaleMode.Default);
    }

    public static Bitmap getBitmap(File file, int i10, int i11, boolean z10, ScaleMode scaleMode) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                SVGHandler sVGHandler = new SVGHandler(i10, i11, z10 ? -1 : null, false, 1.0f, scaleMode);
                if (!z10) {
                    sVGHandler.alphaOnly = true;
                }
                xMLReader.setContentHandler(sVGHandler);
                xMLReader.parse(new InputSource(fileInputStream));
                Bitmap bitmap = sVGHandler.getBitmap();
                fileInputStream.close();
                return bitmap;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    public static Bitmap getBitmap(String str, int i10, int i11, boolean z10) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(i10, i11, z10 ? -1 : null, false, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return sVGHandler.getBitmap();
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }
}
